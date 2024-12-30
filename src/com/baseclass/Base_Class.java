package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;
	
	//WEB DRIVER METHODS
	public static WebDriver browser_launch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			
		}else if(browser.equalsIgnoreCase("Firefox")) {
			
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public static void get_Url(String url) {
		
		driver.get(url);
		
	}
	
	public static void get_Title() {
		
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	public static void get_Current_Url() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static void navigate_To(String url) {
		
		driver.navigate().to(url);

	}
	
	public static void naviagte_Back() {
		
		driver.navigate().back();

	}
	
	public static void navigate_Forward() {
		
		driver.navigate().forward();
		
	}
	
	public static void refresh() {
		
		driver.navigate().refresh();

	}
	
	public static void close_tab() {
		
		driver.close();
		
	}
	
	public static void quit() {
  
		driver.quit();
		
	}
	//WEB ELEMENT METHODS
	
	public static void send_Keys(WebElement element , String value) {

		element.sendKeys(value);
		
	}
	
	public static void click(WebElement element) {
		
		element.click();
		
	}
	
	public static void clear(WebElement element) {
		
		element.clear();

	}
	
	public static void get_Text(WebElement element) {
		
		String text = element.getText();
		System.out.println(text);
		
	}
	
	public static void get_Attribute(WebElement element , String value) {
		
		String attribute = element.getAttribute(value);
		System.out.println(attribute);

	}
	
	public static void is_Displayed(WebElement element) {
		
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}
	
	public static void is_Enabled(WebElement element) {
		
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}
	
	public static void is_Selected(WebElement element) {
		
		boolean selected = element.isSelected();
		System.out.println(selected);

	}
	//SCREENSHOT
	
	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RAHUL\\eclipse-workspace\\Project\\ScreenShots\\"+name+".png");
		FileHandler.copy(source, destination);

	}
	//JAVASCRIPT EXECUTORS
	
	public static JavascriptExecutor javaScriptObj() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
		
	}
	
	public static void scrollUpUsingJS() {
		
		javaScriptObj().executeScript("window.scrollBy(0,500);");

	}
	
	public static void scrollDownUsingJS() {
		
		javaScriptObj().executeScript("window.scrollBy(0,-400;");

	}
	
	public static void scrollIntoViewJS(WebElement element) {
		
		javaScriptObj().executeScript("arguments[0].scrollIntoView();", element);

	}
	
	public static void clickUsingJS(WebElement element) {
		
		javaScriptObj().executeScript("arguments[0].click();",element);

	}
	
	public static void valuePassUsingJS(String id , String value) {
		
		javaScriptObj().executeScript("document.getElementById"+id+".value="+value+";");

	}
	//WAITS 
	
	public static void implicitWaits(int seconds) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}
	
	public static void explicitWaits(int seconds , WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	//DROPDOWN
	
	public static Select dropDownObj(WebElement element) {
		
		Select s = new Select(element);
		return s;

	}
	
	public static void selectByIndex(WebElement element , int value) {
		
		dropDownObj(element).selectByIndex(value);

	}
	
	public static void selectByValue(WebElement element , String value) {
		
		dropDownObj(element).selectByValue(value);

	}
	
	public static void selectByVisibleText(WebElement element , String value) {
		
		dropDownObj(element).selectByVisibleText(value);

	}
	
	public static void deselectByIndex(WebElement element , int value) {
		
		dropDownObj(element).deselectByIndex(value);

	}
	
	public static void deselectByValue(WebElement element , String value) {
		
		dropDownObj(element).deselectByValue(value);

	}
	
	public static void deselectByVisibleText(WebElement element , String value) {
		
		dropDownObj(element).deselectByVisibleText(value);

	}
	
	public static void isMultiple(WebElement element) {
		
		boolean isMultiple = dropDownObj(element).isMultiple();
		System.out.println(isMultiple);
		
	}
	
	public static void getAllOptions(WebElement element) {
		
		List<WebElement> options = dropDownObj(element).getOptions();
		for(WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
		}

	}
	
	public static void getAllSelectedOptions(WebElement element) {
		
		List<WebElement> options = dropDownObj(element).getAllSelectedOptions();
		for(WebElement allSeloptions : options) {
			String selectedText = allSeloptions.getText();
			System.out.println(selectedText);
		}

	}
	
	public static void deselectAll(WebElement element) {
		
		dropDownObj(element).deselectAll();

	}
	//ALERT
	
	public static void acceptAlert() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	
	public static void dismissAlert() {
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}
	
	public static void alertSendKeys(String value) {
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();

	}
	//FRAME
	
	public static void switchToFrameId(String id) {
		
		driver.switchTo().frame(id);

	}
	
	public static void switchToFrameName(String name) {
		
		driver.switchTo().frame(name);

	}
	
	public static void switchToFrameIndex(int index) {
		
		driver.switchTo().frame(index);

	}
	
	public static void switchToFrameWebElement(WebElement element) {
		
		driver.switchTo().frame(element);

	}
	
	public static void switchToParentFrame() {
		
		driver.switchTo().parentFrame();

	}
	
	public static void switchToDefaultContent() {
		
		driver.switchTo().defaultContent();

	}
	//ACTIONS
	
	public static Actions actionsObj() {
		
		Actions ac = new Actions(driver);
		return ac;

	}
	//MOUSE ACTIONS
	
	public static void clickAction(WebElement element) {

		actionsObj().click(element).perform();
		
	}
	
	public static void contextClickAction(WebElement element) {

		actionsObj().contextClick(element).perform();
		
	}
	
	public static void doubleClickAction(WebElement element) {
		
		actionsObj().doubleClick(element).perform();

	}
	
	public static void moveToElementAction(WebElement element) {
		
		actionsObj().moveToElement(element).perform();

	}
	
	public static void dragAndDropAction(WebElement source , WebElement destination) {

		actionsObj().dragAndDrop(source, destination).perform();
		
	}
	
	public static void clickAndHoldAction(WebElement element) {
		
		actionsObj().clickAndHold(element).perform();

	}
	
	public static void releaseAction(WebElement element) {

		
		actionsObj().release(element).perform();
	}
	//KEYBOARD ACTIONS
	
	public static Robot robotObj() throws AWTException {
		
		Robot r = new Robot();
		return r;

	}
	
	public static void enterKey() throws AWTException {

		robotObj().keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public static void upArrow() throws AWTException {
		
		robotObj().keyPress(KeyEvent.VK_UP);

	}
	
	public static void downArrow() throws AWTException {

		robotObj().keyPress(KeyEvent.VK_DOWN);
		
	}
	//WINDOW HANDLE
	
	public static void getWindowHandle() {

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
	}
	
	public static void getWindowHandles() {

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
	}
	
	public static void switchToWindow(int index) {
		
		Set<String> switchWindow = driver.getWindowHandles();
		List <String> newList = new ArrayList <String> (switchWindow);
		driver.switchTo().window(newList.get(index));
		
	}
	 
	
		
}
