package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageHandling_selenium_practice_01gmail {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
	
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Thread.sleep(2000);
		
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		
		Thread.sleep(2000);
		
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		
		Thread.sleep(2000);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		Thread.sleep(1000);
		 
		WebElement emailfield=driver.findElement(By.name("identifier"));
		emailfield.click();
		
		Thread.sleep(3000);
		
		emailfield.sendKeys("eal@gmail.com");
		
		Thread.sleep(3000);
		emailfield.clear();
		
		
		
		driver.close();
		
		
		
		
		

	}

}
