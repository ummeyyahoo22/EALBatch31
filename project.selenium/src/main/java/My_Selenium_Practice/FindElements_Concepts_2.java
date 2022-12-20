package My_Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Concepts_2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
//		WebElement bestsellers=driver.findElement(By.linkText("Best Sellers"));
//		bestsellers.click();
		
		List<WebElement> bestsellersbtn=driver.findElements(By.linkText("Best Sellers 2"));
		int bestslrtotal=bestsellersbtn.size();
		if(bestslrtotal==1) {
			driver.findElement(By.linkText("Best Sellers 2")).click();
		}
		else {
			System.out.println("The Button is not available or link text is changed");
		}
		
		Thread.sleep(3000);
		
		System.out.println("all tasks done");
		
		
		
		

	}

}
