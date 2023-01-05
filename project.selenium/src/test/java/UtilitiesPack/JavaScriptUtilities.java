package UtilitiesPack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilities {
	public static void Jsclick(WebDriver driver, WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].click()",element);
	}
	//handling calender with JavaScriptExecutor
	public static void selectdate(WebDriver driver,WebElement element,String datevalue) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].setAttribute('value','"+datevalue+"')", element);
	}
	//ScrollDown upto the element//
	public static void scrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	//scrolldown to  the page
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	//flashing concept
	//color change method
	public static void changeColor(String color,WebElement element, WebDriver driver) throws InterruptedException {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		Thread.sleep(200);
	}
	//flashing method
	public static void flash_redColor(WebElement element, WebDriver driver) throws InterruptedException {
		String bgcolor=element.getCssValue("backgroundColor");
		
		
		for(int i=0; i<10; i++) {
			changeColor("#FF0000", element, driver);//red
			changeColor(bgcolor, element, driver);
		}
		
	}
	public static void flash_greenColor(WebElement element, WebDriver driver) throws InterruptedException {
		String bgcolor=element.getCssValue("backgroundColor");
		
		
		for(int i=0; i<10; i++) {
			changeColor("#00FF00", element, driver);//green
			//changeColor(bgcolor, element, driver);

}
	}
	public static void flash_blueColor(WebElement element, WebDriver driver) throws InterruptedException {
		String bgcolor=element.getCssValue("backgroundColor");
		
		
		for(int i=0; i<10; i++) {
			changeColor("##0000FF", element, driver);//blue
			//changeColor(bgcolor, element, driver);
	
}
	}
	public static void flash_white(WebElement element, WebDriver driver) throws InterruptedException {
		String bgcolor=element.getCssValue("backgroundColor");
		
		
		for(int i=0; i<50; i++) {
			changeColor("#FFFFFF", element, driver);//white
			//changeColor(bgcolor, element, driver);
	
}
	}
	public static void drawBorder_redcolor(WebDriver driver, WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='6px solid red'", element);
		
	}
	public static void drawBorder_bluecolor(WebDriver driver, WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='6px solid blue'", element);
		}
	public static void drawBorder_greencolor(WebDriver driver, WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='6px solid green'", element);
	}
	
	public static void alertgenerate(WebDriver driver, String message) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("alert('"+message+"')");
		
	}

}
