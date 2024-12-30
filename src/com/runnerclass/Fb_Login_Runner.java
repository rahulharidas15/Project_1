package com.runnerclass;

import com.baseclass.Base_Class;
import com.pom.Fb_Login_pom;
import com.pom.Fb_New_Acc;

public class Fb_Login_Runner extends Base_Class {
	
	public static void main(String[] args) {
		
		browser_launch("Chrome");
		get_Url("https://www.facebook.com/");
		implicitWaits(20);
		
		Fb_Login_pom l = new Fb_Login_pom();
		
		send_Keys(l.getUsername(), "rahul1234@gmail");
		send_Keys(l.getForgot_Password(), "728bxhsn");
		click(l.getForgot_Password());
		naviagte_Back();
		click(l.getLogin());
		naviagte_Back();
		click(l.getNew_Account());
		
		//newAccount
		Fb_New_Acc a = new Fb_New_Acc();
		
		send_Keys(a.getFirstname(), "Rahul");
		send_Keys(a.getLastname(), "Haridas");
		selectByVisibleText(a.getBirth_Day(), "15");
		selectByValue(a.getBirth_Month(), "2");
		selectByVisibleText(a.getBirth_Year(), "2003");
		
	}
	

}
