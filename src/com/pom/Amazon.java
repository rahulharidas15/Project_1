package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;

public class Amazon extends Base_Class{
	
	public Amazon() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement textBox;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement search;

	public WebElement getTextBox() {
		return textBox;
	}

	public WebElement getSearch() {
		return search;
	}
	
	

}
