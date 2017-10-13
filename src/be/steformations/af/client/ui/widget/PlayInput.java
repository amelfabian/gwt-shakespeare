package be.steformations.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiConstructor;

import be.steformations.af.client.event.EventManager;
import be.steformations.af.client.event.reset.ResetEvent;
import be.steformations.af.client.event.reset.ResetEventManager;
import gwt.material.design.client.ui.MaterialListBox;

public class PlayInput extends MaterialListBox implements ResetEventManager{
	
	@UiConstructor
	public PlayInput(String placeholder) {
		GWT.log("PlayInput.PlayInput()");
			
			this.setPlaceholder(placeholder);
			
			this.addItem("Hamlet","Hamlet");
			this.addItem("lear","King Lear");
			this.addItem("macbeth","MacBeth");
			this.addItem("much_ado","Much ado about nothing");
			this.addItem("othello","Othello");
			this.addItem("romeo_and_juliet","Romeo and juliet");
			this.addItem("tempest","The tempest");
			
			this.setSelectedIndex(0);
			
			EventManager.getInstance().addHandler(ResetEvent.type, this);
			
		
	}

	@Override
	public void onReset(ResetEvent event) {
			GWT.log("PlayInput.onReset()");
			this.setSelectedIndex(0);
	}
}
