package com.runnerclass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.pom.Amazon;

public class Amazon_DaraProvider extends Base_Class {
	
	
	@DataProvider(name="searchInfo")
	public Object[] datas() {
		Object[] data = new Object[3];
		data[0]="iphone 13";
		data[1]="iphone 14";
		data[2]="iphone 15";
		return data;
	}
	
	@Test
	public void browser_Lauch() {
		
		browser_launch("Chrome");
		get_Url("https://www.amazon.in/");
		
	}
	@Test(dataProvider="searchInfo")
	public void amazon_Search(String value) {
		implicitWaits(30);
		
		Amazon l = new Amazon();
		send_Keys(l.getTextBox(), value);
		click(l.getSearch());
		
	}

}
