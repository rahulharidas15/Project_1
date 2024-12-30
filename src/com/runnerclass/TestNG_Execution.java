package com.runnerclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.pom.Fb_Login_pom;

public class TestNG_Execution extends Base_Class {
	
	@Test(priority=-3 , groups="@Smoke")
	public void browserLaunch() {

		browser_launch("chrome");
		Assert.assertEquals(true, true);
		System.out.println("successfully launched");
			
	}
	@Test(priority=1 , groups="Sanity")
	public void getUrl() {

		get_Url("https://www.facebook.com/");
		System.out.println("url launched");
		
	}
	@Test(priority=5 , groups="Regression")
	public void login() {
		
		Fb_Login_pom l = new Fb_Login_pom();
		send_Keys(l.getUsername(), "hjdgff5435");
		send_Keys(l.getPassword(), "jhjhbjtfcb643");
		click(l.getLogin());
		
	}
	
	

}
