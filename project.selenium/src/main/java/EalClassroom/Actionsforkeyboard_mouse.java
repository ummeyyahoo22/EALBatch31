package EalClassroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsforkeyboard_mouse {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions acct=new Actions(driver);
		acct.moveToElement(signin).build().perform();
		
		Thread.sleep(3000);
		
		WebElement primemebership=driver.findElement(By.xpath("//*[text()='Prime Membership']"));
		acct.moveToElement(primemebership).build().perform();
		
		//driver.close();
		
	
		
		
		

	}

}
