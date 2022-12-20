package EalClassroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageHandling {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		 
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 Thread.sleep(5000);
		 
		 //locating email field//
		 
		 WebElement emailfield=driver.findElement(By.id("email"));
		 
		 //clicking on email field//
		 
		 emailfield.click();
		 
		 //write eal@gmail//
		 
		 emailfield.sendKeys("eal@gmail.com");
		 
		 Thread.sleep(3000);
		 
		 //locate password field//
		WebElement passwordfield= driver.findElement(By.name("pass"));
		
		passwordfield.sendKeys("@abc123");
		
		
		 
		 
		
		
		
	}

}
