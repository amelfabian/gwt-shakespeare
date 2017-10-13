package be.steformations.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiConstructor;

import gwt.material.design.client.ui.MaterialTextBox;

public class SpeakerInput extends MaterialTextBox {
	
	@UiConstructor
	public SpeakerInput(String label) {
		GWT.log("SpeakerInput.SpeakerInput()");
		this.setLabel(label);
		this.setText("hamlet");
	}
}
