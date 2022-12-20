package My_Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement bestsellersbook=driver.findElement(By.xpath("//span[text()='Best Sellers in Books']"));
		//JavaScriptUtilities.scrollIntoView(bestsellersbook, driver);
	

		//JavaScriptUtilities.scrollPageDown(driver);//scrolldownto the page
		//JavaScriptUtilities.flash(bestsellersbook, driver);
		
		WebElement bestbook=driver.findElement(By.xpath("//span[text()='Best Sellers in Books']"));
		JavaScriptUtilities.scrollIntoView(bestbook, driver);//scrollto the element
		//JavaScriptUtilities.flash(bestbook, driver);//flashing
		JavaScriptUtilities.drawBorder(driver, bestbook);//border
		JavaScriptUtilities.generateAlert(driver, "this page is having a problem");
		
		
		Thread.sleep(6000);
		
		
		driver.close();

		
		
	}

}
