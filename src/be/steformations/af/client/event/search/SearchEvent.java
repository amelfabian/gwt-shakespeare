package be.steformations.af.client.event.search;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.GwtEvent;

public class SearchEvent extends GwtEvent<SearchEventManager> {

		public final static GwtEvent.Type<SearchEventManager> type = new GwtEvent.Type<SearchEventManager>();
		private SearchParams params;
		
		public SearchEvent(SearchParams params) {
			super();
			this.params = params;
			}
	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<SearchEventManager> getAssociatedType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	protected void dispatch(SearchEventManager handler) {
		GWT.log("SearchEvent.dispatch()" + handler);
		handler.onSearch(this);
	}
	public SearchParams getParams() {
		return params;
	}
	public void setParams(SearchParams params) {
		this.params = params;
	}
	public static GwtEvent.Type<SearchEventManager> getType() {
		return type;
	}

}
