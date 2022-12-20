package My_Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Basics_Selenium_practice_01walmart {
	
	static WebDriver numbers;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		numbers=new ChromeDriver();
		
		Thread.sleep(3000);
		
		numbers.manage().window().maximize();
		
		Thread.sleep(2000);
	     
		numbers.get("https://www.walmart.com");
		
		Thread.sleep(3000);
		
		numbers.navigate().refresh();
		
		Thread.sleep(2000);
		
		String getWindowHandle=numbers.getWindowHandle();//sessionid
		System.out.println(getWindowHandle);
		
		Thread.sleep(3000);
		
		String getCurrentUrl=numbers.getCurrentUrl();
		System.out.println(getCurrentUrl);
		
		Thread.sleep(2000);
		
		String getTitle=numbers.getTitle();
		System.out.println(getTitle);
		
		Thread.sleep(2000);
		
		String getPageSource=numbers.getPageSource();
		System.out.println(getPageSource);
		
		Thread.sleep(2000);
		
		numbers.navigate().back();
		
		Thread.sleep(3000);
		
		numbers.navigate().forward();
		
		numbers.manage().window().minimize();
		
		

	}

}
