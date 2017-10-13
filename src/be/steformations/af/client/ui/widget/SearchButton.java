package be.steformations.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiConstructor;

import gwt.material.design.client.ui.*;
public class SearchButton extends MaterialButton {



	@UiConstructor
	public SearchButton(String text) {
		GWT.log("SearchButton.SearchButton()");
		this.setText(text);
	}
}
