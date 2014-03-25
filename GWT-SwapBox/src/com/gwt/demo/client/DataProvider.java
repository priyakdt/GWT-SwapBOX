package com.gwt.demo.client;

import java.util.ArrayList;
import java.util.List;



public class DataProvider {

	public static List getLeftList() {
		List leftList = new ArrayList();
		leftList.add("one");
		leftList.add("three");
		leftList.add("five");
		leftList.add("six");
		return leftList;
	}

	public static List getRightList() {
		List rightList = new ArrayList();
		rightList.add("Two");
		rightList.add("four");
		return rightList;
	}
	
	
}
