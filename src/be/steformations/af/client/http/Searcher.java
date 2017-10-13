package be.steformations.af.client.http;

import org.eclipse.jetty.http.HttpParser.RequestHandler;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

import be.steformations.af.client.event.EventManager;
import be.steformations.af.client.event.search.SearchEvent;
import be.steformations.af.client.event.search.SearchEventManager;
import be.steformations.af.client.event.search.SearchParams;

public class Searcher implements SearchEventManager,RequestCallback{
	private RequestBuilder requestBuilder;
	private SearchParamsObjectMapper mapper;
	 public Searcher() {
		 super();
		 String url = Window.Location.getPath().replace("index.html", "");
		 url += "json/service";
		 this.requestBuilder = new RequestBuilder(requestBuilder.POST, url);
		 this.requestBuilder.setCallback(this);
		 this.mapper = GWT.create(SearchParamsObjectMapper.class);
		 EventManager.getInstance().addHandler(SearchEvent.type, this);
	 }
	@Override
	public void onSearch(SearchEvent event) {
		SearchParams params = event.getParams();
		GWT.log("Searcher.onSearch() =>" + params);
		String json = this.mapper.write(params);
		this.requestBuilder.setRequestData(json);
		try {
			this.requestBuilder.send();
		} catch (Exception e) {
			Window.alert(e.getMessage());
		}
	}
	@Override
	public void onResponseReceived(Request request, Response response) {
		GWT.log("Searcher.onResponseReceived()");
		String monologue = response.getText();
		Window.alert(monologue);
		
	}
	@Override
	public void onError(Request request, Throwable exception) {

		Window.alert(exception.getMessage());
	}

}
