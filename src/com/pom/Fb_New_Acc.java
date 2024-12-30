package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;

public class Fb_New_Acc extends Base_Class{
	
	public Fb_New_Acc() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	private WebElement birth_Day;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement birth_Month;

	@FindBy(xpath = "//select[@aria-label='Year']")
	private WebElement birth_Year;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBirth_Day() {
		return birth_Day;
	}

	public WebElement getBirth_Month() {
		return birth_Month;
	}

	public WebElement getBirth_Year() {
		return birth_Year;
	}
	
	

	
	
}
