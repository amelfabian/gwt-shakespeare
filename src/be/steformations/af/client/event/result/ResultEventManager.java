package be.steformations.af.client.event.result;

import com.google.gwt.event.shared.EventHandler;

public interface ResultEventManager extends EventHandler {

	void onResult(ResultEvent resultEvent);
	
}
