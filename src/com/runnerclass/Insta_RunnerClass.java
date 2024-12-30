package com.runnerclass;

import com.baseclass.Base_Class;
import com.pom.Insta_Login_Page;

public class Insta_RunnerClass extends Base_Class {
	
	public static void main(String args[]) {
		
		browser_launch("chrome");
		get_Url("https://www.instagram.com/");
		
		implicitWaits(20);
		
		Insta_Login_Page l = new Insta_Login_Page();
		
		send_Keys(l.getUsername(), "rahulxyz@gmail");
		send_Keys(l.getPassword(), "qwerty");
		click(l.getLogin());
		click(l.getSignUp());
		
	}
	
}
