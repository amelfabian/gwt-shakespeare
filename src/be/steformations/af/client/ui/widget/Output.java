package be.steformations.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;

import be.steformations.af.client.event.EventManager;
import be.steformations.af.client.event.reset.ResetEvent;
import be.steformations.af.client.event.reset.ResetEventManager;
import gwt.material.design.client.ui.MaterialLabel;

public class Output extends MaterialLabel implements ResetEventManager {
	 public Output() {
		 GWT.log("Output.Output()");	
		 EventManager.getInstance().addHandler(ResetEvent.type, this);
	 }

	@Override
	public void onReset(ResetEvent event) {
		GWT.log("Output.onReset()");
		this.setText("");
	}
}
