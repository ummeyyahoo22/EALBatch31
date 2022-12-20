package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_slidePractice_selenium_01 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.Gap.com");
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		String getCurrentUrl=driver.getCurrentUrl();
		System.out.println(getCurrentUrl);
		
		Thread.sleep(3000);
		
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		
		String getTitle=driver.getTitle();
		System.out.println(getTitle);
		
		//driver.findElement(By.tagName("text"));
		
		driver.manage().window().minimize();
		driver.close();

	}

}
