package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practice_sel_10 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		

		WebElement createaccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
		createaccount.click();
		
		Thread.sleep(5000);
		
		WebElement signupfirstname=driver.findElement(By.xpath("//input[@type='text' and @name='firstname' ]"));
		signupfirstname.click();
		signupfirstname.sendKeys("firstname");
		
		

	

}
}
