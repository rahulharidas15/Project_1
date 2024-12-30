package com.runnerclass;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.pom.Adactin_Login;

public class Data_Providers extends Base_Class{
	
	@DataProvider(name="loginInfo")
	public Object[][] data(){		
		Object[][] data = new Object[3][2];
		data[0][0]="Rahul";
		data[0][1]="Rahul123";
		data[1][0]="James";
		data[1][1]="James123";
		data[2][0]="Benny";
		data[2][1]="Benny123";
		return data;		
	}	
	@Test
	public void tc01() {
		browser_launch("chrome");
		get_Url("https://adactinhotelapp.com/");
	}	
	@Test(dataProvider="loginInfo")
	public void tc02(String username , String password) {
		implicitWaits(20);
		
		Adactin_Login l = new Adactin_Login();
		
		send_Keys(l.getUsername(), username);
		send_Keys(l.getPassword(), password);
		click(l.getLogin());	
	}	
	@Test
	public void tc03() throws IOException {
		Adactin_Login l = new Adactin_Login();
		
		get_Text(l.getErrormsg());
		screenshot("Adactin_Login");
		
	}
	

}
