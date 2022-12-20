package EalClassroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
          Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("123456");//css selector//
		
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123");
		
		

		WebElement createaccount=driver.findElement(By.linkText("Create new account"));
		createaccount.click();
		Thread.sleep(2000);
		
		//absolute xpath//
				WebElement maleradiobtn=driver.findElement(By.xpath("(html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
				maleradiobtn.click();
		
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
		
		
		
		

	}

}
