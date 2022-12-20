package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Mandatory_Slidetask_01 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("123456");//css selector//
		
		//absolute xpath//
		WebElement maleradiobtn=driver.findElement(By.xpath("(html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
		maleradiobtn.click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123");
		
		
		WebElement createaccount=driver.findElement(By.linkText("Create new account"));
		createaccount.click();
		
		Thread.sleep(2000);
	
       WebElement firstname=driver.findElement(By.name("firstname"));
       firstname.click();
       
       Thread.sleep(2000);
       firstname.sendKeys("qa");
       
       WebElement lastnamefield=driver.findElement(By.name("lastname"));
       lastnamefield.click();
       lastnamefield.sendKeys("engineer");
       
       
       WebElement phonenumberfield=driver.findElement(By.name("reg_email__"));
       phonenumberfield.click();
       phonenumberfield.sendKeys("7884885612");
       
       WebElement passordfield=driver.findElement(By.id("password_step_input"));
       passordfield.click();
       passordfield.sendKeys("12345678m");
       
       WebElement almonth=driver.findElement(By.id("month"));
       Select month=new Select(almonth);
       month.selectByIndex(1);
       
       WebElement alldays=driver.findElement(By.id("day"));
       Select day=new Select(alldays);
       day.selectByVisibleText("22");
       
       WebElement years=driver.findElement(By.id("year"));
       Select allyears=new Select(years);
       allyears.selectByValue("2000");
       
       WebElement genders=driver.findElement(By.name("sex"));
       genders.click();
       
       Thread.sleep(5000);
       
       
       WebElement signup=driver.findElement(By.name("websubmit"));
       signup.click();
       
       driver.navigate().back();
       
       Thread.sleep(2000);
       
       String pagetitle=driver.getTitle();
       System.out.println(pagetitle);
       
       String sessionid=driver.getWindowHandle();
       System.out.println(sessionid);
       
      
       
      
       
       Thread.sleep(2000);
       
       driver.navigate().forward();
       
       Thread.sleep(6000);
       
      
       			 driver.close();
		
		
		
		
		
		

	}

}
