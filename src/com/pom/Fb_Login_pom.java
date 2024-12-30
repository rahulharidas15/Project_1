package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;

public class Fb_Login_pom extends Base_Class{
	
	public Fb_Login_pom() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;
	
	@FindBy(linkText = "Forgotten password?")
	private WebElement forgot_Password;
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement new_Account;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgot_Password() {
		return forgot_Password;
	}

	public WebElement getNew_Account() {
		return new_Account;
	}
	
	

}
