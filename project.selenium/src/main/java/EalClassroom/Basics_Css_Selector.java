package EalClassroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_Css_Selector {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		//css selector by id//
		WebElement emailfield=driver.findElement(By.cssSelector("#email"));
		emailfield.clear();
		emailfield.sendKeys("qaengineer@gmail.com");
		
		Thread.sleep(4000);
		
	
		//scc selector by class//
		WebElement emailfield1=driver.findElement(By.cssSelector("input#email"));
		emailfield1.click();
		
		
		//absolute xpath//
		WebElement malbutton=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
		malbutton.click();
		driver.close();
		
		Thread.sleep(3000);
		
		//relative xpath//
		WebElement signupbutton=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signupbutton.click();
		
		//text xpath//
		
		WebElement textpathsignupbutton=driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']"));
		textpathsignupbutton.click();
		
		//contains xpth//
		WebElement forgotpasswordbutton=driver.findElement(By.xpath("//*[contains(text(),'Forgot')]"));
		forgotpasswordbutton.click();

	}

}
