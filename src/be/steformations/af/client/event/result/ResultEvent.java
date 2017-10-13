package be.steformations.af.client.event.result;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.GwtEvent;

public class ResultEvent extends GwtEvent<ResultEventManager>{
	
	public static final GwtEvent.Type<ResultEventManager> type = new GwtEvent.Type<ResultEventManager>();
	
	private String monologue;
	
	public ResultEvent(String monologue) {
		super();
		this.monologue = monologue;
	}
	
	public String getMonologue() {
		return monologue;
	}

	public void setMonologue(String monologue) {
		this.monologue = monologue;
	}



	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<ResultEventManager> getAssociatedType() {
	
		return type;
	}

	@Override
	protected void dispatch(ResultEventManager handler) {
		GWT.log("ResultEvent.dispatch()");
		handler.onResult(this);
	}

}
