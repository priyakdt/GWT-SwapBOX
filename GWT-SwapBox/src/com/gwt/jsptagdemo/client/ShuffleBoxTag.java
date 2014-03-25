
package com.gwt.jsptagdemo.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwt.demo.client.shufflebox.ShuffleBox;


public class ShuffleBoxTag extends WidgetInjector {

	
	@Override
	public Widget createWidget(String id) {
		return new ShuffleBox(null, null);
	}

	
	@Override
	public void onWidgetLoad() {
		Window.alert("Widget attached");

	}

}
