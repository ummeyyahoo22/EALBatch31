package My_Selenium_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sel_12_JavaScriptsUtilities extends Sel_12_Task_Utilits{
	
	
	//Click with javaScript
	public static void Jsclick(WebDriver driver, WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].click()", element);
	}
	//select date with javaScript
	public static void selectdatebyJavaScript(WebDriver driver, WebElement element,String datevalue) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].setAttribute('value','"+datevalue+"')", element);
		
	}
	//Scrolldown upto element
		public static void scrollIntoView(WebElement element,WebDriver driver) {
			JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
			jsexecutor.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		//scroll bottom of page
		public static void scrollPageDown(WebDriver driver) {
			JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
			jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
		//flashing concept//
		//changing back ground color
		public static void changeColor(String color,WebElement element, WebDriver driver) {
			JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
			jsexecutor.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//flashing method
		public static void flash(WebElement element,WebDriver driver) {
			String bgcolor=element.getCssValue("backgroundColor");
			System.out.println(bgcolor);
			
			for(int i=0; i<50;i++) {
			changeColor("#0000FF", element, driver);
			changeColor(bgcolor, element, driver);
			}
		}
		public static void drawBorder(WebDriver driver,WebElement element) {
			JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
			
			jsexecutor.executeScript("arguments[0].style.border='6px solid green'", element);
		}
		//draw alert//
		public static void generateAlert(WebDriver driver,String message) {
			JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
			jsexecutor.executeScript( "alert('"+message+"')");
			
		}
		

	
}
