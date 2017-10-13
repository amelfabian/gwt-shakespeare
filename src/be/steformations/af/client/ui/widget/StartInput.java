package be.steformations.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiConstructor;

import gwt.material.design.client.ui.MaterialTextBox;

public class StartInput extends MaterialTextBox{
	@UiConstructor
	public StartInput(String label) {
	GWT.log("StartInput.StartInput()");	
	this.setLabel(label);
	this.setText("To be, or not to be");
	
	}
}
