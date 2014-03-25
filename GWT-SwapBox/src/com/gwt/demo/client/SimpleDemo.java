package com.gwt.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.gwt.demo.client.shufflebox.ShuffleBox;


public class SimpleDemo implements EntryPoint {


	public void onModuleLoad() {
		shuffleBoxDemo();
	}

	private void shuffleBoxDemo() {
		ShuffleBox shuffleBox = new ShuffleBox(DataProvider.getLeftList(),
				DataProvider.getRightList());
		shuffleBox.setStyleName("ShuffleBox");
		RootPanel.get().add(shuffleBox);

	}

	
}
