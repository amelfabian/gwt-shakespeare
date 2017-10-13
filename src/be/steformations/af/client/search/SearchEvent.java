package be.steformations.af.client.search;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.GwtEvent;

public class SearchEvent extends GwtEvent<SearchEventManager> {

		public final static GwtEvent.Type<SearchEventManager> type = new GwtEvent.Type<SearchEventManager>();
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

}
