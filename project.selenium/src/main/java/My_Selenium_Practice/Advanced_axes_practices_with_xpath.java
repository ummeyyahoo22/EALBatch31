package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced_axes_practices_with_xpath {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		//locate preceding sibling with help with following sibling
		
	WebElement emailfield	=driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']"));
	
	emailfield.click();
	emailfield.sendKeys("easyautomationlab@gmail.com");
	
	Thread.sleep(2000);
	
	//locating child with the help of parent element
	
	
	driver.findElement(By.xpath("(//div[@class='container']/child::input[@type='text'])[3]"));
	
	//locate parent with the help of unique child//
	
	WebElement emailfield1=driver.findElement(By.xpath("//label[text()='Email']//parent::div[@class='container']"));
	
	//preceding sibling with the help of following sibling//
	
	WebElement signincontact=driver.findElement(By.xpath("//td[text()='Maria Anders']//preceding-sibling::td/child::input"));
	signincontact.click();
	
	//locate grandchildren with help of grandparents//
	
	WebElement resetfield=driver.findElement(By.xpath("//div[@class='container']/descendant::button[text()='Reset']"));
	
	//locate ancestors with descendant elements//
	
	WebElement resetfield1=driver.findElement(By.xpath("(//div[@class='buttons']/ancestor-or-self::div)[12]"));
	
	
	//following and preceding//
	WebElement  passwordfield=driver.findElement(By.xpath("(//label[text()='Password']/following::input[@type='password'])[1]"));
	
	//preceding//
	
	WebElement passwordfield1=driver.findElement(By.xpath("(//label[text()='Password']/preceding::input)[3]"));
	
	
	
	
		

	}

}
