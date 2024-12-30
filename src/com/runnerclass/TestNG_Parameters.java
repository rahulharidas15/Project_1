package com.runnerclass;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.pom.Fb_Login_pom;

public class TestNG_Parameters extends Base_Class {
	
	@Test(priority=-3 )
	public void browserLaunch() {

		browser_launch("chrome");
		Assert.assertEquals(true, true);
		System.out.println("successfully launched");
			
	}
	@Test(priority=1 )
	public void getUrl() {

		get_Url("https://www.facebook.com/");
		System.out.println("url launched");
		
	}
	@Test(priority=5 )
	@Parameters({"username" , "password"})
	public void login(String username , String password) {
		
		Fb_Login_pom a = new Fb_Login_pom();
		send_Keys(a.getUsername(), username);
		send_Keys(a.getPassword(), password);
		click(a.getLogin());

	}
}
