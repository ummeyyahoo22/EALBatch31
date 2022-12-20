package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PageHandling_Selenium_Practice_01Facebook {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		
		driver=new ChromeDriver();		
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(4000);
		
		//locating email field//
		WebElement emailfield=driver.findElement(By.id("email"));
		WebElement emailfield1=driver.findElement(By.name("email"));
		
		
		//for clicking on emailfield//
		emailfield.click();
		
		//write eal@gmail//
		emailfield.sendKeys("eal@gmail");
		
		Thread.sleep(3000);
		
		//locating password_field//
		WebElement passwordfield=driver.findElement(By.name("pass"));
		
		
		//clicking on passwordfield//
		passwordfield.click();
		
		//writing on passwordfield//
		passwordfield.sendKeys("abc123");
		
		Thread.sleep(3000);
		
		//locating login field//
	     WebElement loginfield=driver.findElement(By.name("login"));
	     
	     //clicking login field//
	      loginfield.click();
	      
	      Thread.sleep(2000);
	      
	     driver.navigate().back();
	     
	     //clearing emailfield
	     WebElement emailfield2=driver.findElement(By.id("email"));
	     
	     emailfield2.clear();
	     
	     //clearing passwordfield//
	     WebElement passwordfield1=driver.findElement(By.name("pass"));
	     passwordfield1.clear();
	     
	     
	   //click on forgot password//
		    WebElement forgotpassword= driver.findElement(By.linkText("Forgot password?"));
		    forgotpassword.click();
		    
		    Thread.sleep(2000);
		    
		    driver.navigate().back();
		    
		    Thread.sleep(2000);
		    
		    WebElement createaccount=driver.findElement(By.linkText("Create new account"));
		    createaccount.click();
		    
		    Thread.sleep(6000);
		    
		    WebElement firstname=driver.findElement(By.name("firstname"));
		    firstname.click();
		   
		    
		    Thread.sleep(2000);
		    firstname.sendKeys("easy");
		    
		    Thread.sleep(1000);
		    
		    WebElement lastname=driver.findElement(By.name("lastname"));
		    lastname.click();
		    
		    lastname.sendKeys("automation");
		    
		    Thread.sleep(1000);
		    
		   WebElement phonenumberfield =driver.findElement(By.name("reg_email__"));
		   phonenumberfield.click();
		   phonenumberfield.sendKeys("7168886254");
		   
		   Thread.sleep(2000);
		   
		   WebElement newpasswordfield=driver.findElement(By.id("password_step_input"));
		   newpasswordfield.click();
		   newpasswordfield.sendKeys("abc123456");
		   Thread.sleep(6000);
		   
		  WebElement allmonths= driver.findElement(By.name("birthday_month"));
		  Select month=new Select(allmonths);
		  month.selectByIndex(7);
		  
		  Thread.sleep(5000);
		  
		  WebElement alldays=driver.findElement(By.name("birthday_day"));
		  Select day=new Select(alldays);
		  day.selectByValue("28");
		  
		  Thread.sleep(5000);
		  
		  WebElement allyear=driver.findElement(By.name("birthday_year"));
		  Select year=new Select(allyear);
		  year.selectByVisibleText("2022");
		  
		  
		  
		  Thread.sleep(2000);
		    
		    
	   // click on forgot password//
		 //  WebElement forgotpasswordpartial= driver.findElement(By.partialLinkText("forgot"));
		  // forgotpasswordpartial.click();
    
	     //driver.manage().window().minimize();
	     
	     driver.close();
	     
	     
	     
	     
	     
	     
		
		
		
		
		
		
		
		

	}

}
