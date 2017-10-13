package be.steformations.af.client.http;

import com.google.gwt.core.shared.GWT;

import be.steformations.af.client.event.EventManager;
import be.steformations.af.client.event.search.SearchEvent;
import be.steformations.af.client.event.search.SearchEventManager;
import be.steformations.af.client.event.search.SearchParams;

public class Searcher implements SearchEventManager{
	 public Searcher() {
		 super();
		 EventManager.getInstance().addHandler(SearchEvent.type, this);
	 }
	@Override
	public void onSearch(SearchEvent event) {
		SearchParams params = event.getParams();
		
		GWT.log("Searcher.onSearch()" + params);
	}

}
