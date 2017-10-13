package be.steformations.af.client.event;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;

public class EventManager {

	private static EventManager instance = new EventManager();
	private HandlerManager handlerManager;
	
	public static EventManager getInstance(){
		return instance;
	}
	
	
	private EventManager() {
		super();
		GWT.log("EventManger.EventManager()");
		this.handlerManager = new HandlerManager(this);
		
	}

	public <H extends EventHandler> HandlerRegistration addHandler(Type<H> type, H handler) {
		GWT.log("EventManager.addHandler()");
		return handlerManager.addHandler(type, handler);
	}

	public void fireEvent(GwtEvent<?> event) {
		GWT.log("EventManager.fireEvent()");
		handlerManager.fireEvent(event);
	}
}
