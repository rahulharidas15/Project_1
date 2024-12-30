package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;

public class Insta_Login_Page extends Base_Class {
	
	public Insta_Login_Page() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//div[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath = "//span[contains(text(),'Forgotten')]")
	private WebElement forgotpassword;
	
	@FindBy(xpath = "//span[text()='Sign up']")
	private WebElement signUp;
	
	@FindBy(xpath = "//div[text()='Log in with Facebook']")
	private WebElement logInWithFacebook;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgotpassword() {
		return forgotpassword;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getLogInWithFacebook() {
		return logInWithFacebook;
	}
	
	

}
