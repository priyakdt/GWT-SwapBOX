package com.gwt.jsptagdemo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;


public class GWTPageContext {

	private static GWTPageContext singleton = new GWTPageContext();

	private static String Widget = "widget";

	
	public static GWTPageContext getInstance() {
		return singleton;
	}


	private Map map = null;

	
	private GWTPageContext() {
	}

	
	public Map getWidgetPlaceHolder() {
		
		return null;
	}


}
