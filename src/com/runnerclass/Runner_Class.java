package com.runnerclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class Runner_Class extends Base_Class{
	
	public static void main(String[] args) throws IOException {
		
		browser_launch("chrome");
		get_Url("https://www.meesho.com");
		
		screenshot("meesho");
		
		navigate_To("https://www.flipkart.com");
		
		get_Title();
		
		get_Current_Url();
		
		WebElement type = driver.findElement(By.xpath("//input[@class='Pke_EE']"));	
		send_Keys(type, "Asus Rog");
		
		clear(type);
		
		send_Keys(type, "Iqoo 12");
		
		WebElement search = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
		click(search);
		
		naviagte_Back();
		
		navigate_Forward();
		
		screenshot("flipkart");
		
		WebElement ele1 = driver.findElement(By.xpath("(//span[@class='TSD49J'])[2]"));
		get_Text(ele1);
		
		get_Attribute(ele1,"class");
		
		is_Displayed(ele1);
		
		is_Selected(ele1);
		
		is_Enabled(ele1);
		
		WebElement phone1 = driver.findElement(By.xpath("(//a[@class='CGtC98'])[1]"));	
		click(phone1);
		
		close_tab();
		
		quit();
		
	}

}
