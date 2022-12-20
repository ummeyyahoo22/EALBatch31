package My_Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementInteraction_Sel_12{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement searchfield=driver.findElement(By.cssSelector("input[class='gLFyf']"));
		searchfield.click();
		searchfield.sendKeys("Qa Job Salary in USA");
		
		WebElement googlesearch=driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));	
		
//		WebDriverWait exwait=new WebDriverWait(driver, Duration.ofSeconds(10));//explicit wait
//		exwait.until(ExpectedConditions.elementToBeClickable(googlesearch));
//		googlesearch.click();
		
		JavascriptExecutor jsexecutor= (JavascriptExecutor)driver;
		jsexecutor.executeAsyncScript("arguments[0].click()", googlesearch);
		//googlesearch.click();
	
		
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
