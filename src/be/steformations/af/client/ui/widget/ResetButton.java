package be.steformations.af.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiConstructor;

import gwt.material.design.client.ui.MaterialButton;

public class ResetButton extends MaterialButton {

		@UiConstructor
		public ResetButton(String text) {
			GWT.log("ResetButton.ResetButton()");
			this.setText(text);
		}
}
