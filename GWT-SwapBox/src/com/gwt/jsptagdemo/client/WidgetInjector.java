package com.gwt.jsptagdemo.client;

import java.util.Iterator;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;


public abstract class WidgetInjector implements EntryPoint {

  public void onModuleLoad() {
    final List placeHolders = (List) GWTPageContext.getInstance()
        .getWidgetPlaceHolder().get(getModuleName());
    if (placeHolders != null) {
      final Iterator iter = placeHolders.iterator();
      while (iter.hasNext()) {
        final Element placeHolder = (Element) iter.next();
        final String id = DOM.getElementAttribute(placeHolder, "id");
        if (id != null && id.trim().length() > 0) {
          final Widget widget = createWidget(id);
          RootPanel.get(id).add(widget);
          onWidgetLoad();
        }
      }
    }
  }

  
  private String getModuleName() {
    final String pkgName = GWT.getModuleName();
    return pkgName.substring(pkgName.lastIndexOf('.') + 1);
  }

 
  public String getValue(final String id,final String key) {
    return DOM.getElementAttribute(DOM.getElementById(id), key);
  }

  
  public abstract Widget createWidget(final String id);
  

  public abstract void onWidgetLoad();

}
