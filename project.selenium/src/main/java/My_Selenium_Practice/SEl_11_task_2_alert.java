package My_Selenium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import JavaScriptPack.JavaScriptUtilities;


public class SEl_11_task_2_alert {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		IBrowsers("chrome", "https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement clickme=driver.findElement(By.cssSelector("button[id='alertBox']"));
		Thread.sleep(2000);
		clickme.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement confirmbox=driver.findElement(By.cssSelector("button#confirmBox"));
		JavaScriptUtilities.Jsclick(driver, confirmbox);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		List<WebElement> tagname=driver.findElements(By.tagName("button"));
		System.out.println(tagname.size());
		
	
		
		
		driver.close();

	}
	public static void IBrowsers(String NameOfBrower,String url) {
		if(NameOfBrower.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
			
			driver=new  ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if (NameOfBrower.equalsIgnoreCase("edge"))	{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
			
		}
	}

}
