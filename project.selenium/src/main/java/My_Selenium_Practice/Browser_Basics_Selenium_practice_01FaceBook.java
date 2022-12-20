package My_Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Basics_Selenium_practice_01FaceBook {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		String getcurrenturl=driver.getCurrentUrl();
		System.out.println(getcurrenturl);
		
		Thread.sleep(1000);
		
		String getPageSource=driver.getPageSource();
		System.out.println(getPageSource);
		
		Thread.sleep(1000);
		
		String getTitle=driver.getTitle();
		System.out.println(getTitle);
		
		Thread.sleep(1000);
		
		String getWindowHandle=driver.getWindowHandle();
		System.out.println(getWindowHandle);
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();

	}

}
