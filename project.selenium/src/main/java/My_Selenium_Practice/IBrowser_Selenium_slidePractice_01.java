package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IBrowser_Selenium_slidePractice_01 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		
		Thread.sleep(1000);
		
		String getCurrentUrl=driver.getCurrentUrl();
		System.out.println(getCurrentUrl);
		
		String getTitle=driver.getTitle();
		System.out.println(getTitle);
		
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.click();
		searchfield.sendKeys("qajob");
		
		Thread.sleep(3000);
		searchfield.clear();
		searchfield.sendKeys("salary for qa job");
		
		Thread.sleep(3000);
		searchfield.click();
		Thread.sleep(3000);
		
		searchfield.clear();
	
		
		
		Thread.sleep(3000);
		
		
		driver.close();
		

	}

}
