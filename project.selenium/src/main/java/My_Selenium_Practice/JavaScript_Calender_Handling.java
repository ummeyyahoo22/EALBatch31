package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Calender_Handling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement DateField=driver.findElement(By.xpath("//input[@id='first_date_picker']"));
		DateField.click();
		String mydate="12/19/2022";
		SelectDateByJS(driver, DateField, mydate);
		Thread.sleep(3000);
		
		
		
		
		driver.close();

	}
	public static void SelectDateByJS(WebDriver driver,WebElement element,String DateValue) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].setAttribute('value','"+DateValue+"')", element);
	}

}
