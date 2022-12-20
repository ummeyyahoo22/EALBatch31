package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay_task_WithXpath {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.ebay.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		if(currenturl.equals("https://www.ebay.com/")) {
			System.out.println("currenturl is correct according to requirement");
		}
		else {
			System.out.println("currenturl is not correct");
		}
		Thread.sleep(5000);
		
		WebElement myebayaccount=driver.findElement(By.xpath("//a[text()='My eBay']"));
		Actions myebay=new Actions(driver);
		myebay.moveToElement(myebayaccount).build().perform();
		
		WebElement summary=driver.findElement(By.xpath("//a[text()=' Summary']"));
		summary.click();
		Thread.sleep(5000);
		
		String currenturl1=driver.getCurrentUrl();
		System.out.println(currenturl1);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(6000);
		
		WebElement allcatagory=driver.findElement(By.xpath("//button[text()='Shop by category']"));
		allcatagory.click();
		
		WebElement books=driver.findElement(By.xpath("//a[text()='Books, Movies & Music']"));
		books.click();
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='_nkw']"));
				searchbox.click();
				searchbox.sendKeys("qa testing books");
		WebElement searchbutton=driver.findElement(By.xpath("//*[contains(@type,'submit')]"));
		searchbutton.click();
				
		Thread.sleep(5000);
		String getcurrenturl=driver.getCurrentUrl();
		System.out.println(getcurrenturl);
		
		Thread.sleep(2000);
		
		WebElement shopbycategory=driver.findElement(By.xpath("//button[text()='Shop by category']"));
		shopbycategory.click();
		
		Thread.sleep(2000);
		
		WebElement motors=driver.findElement(By.xpath("//a[text()='Motors']"));
		motors.click();
		
		Thread.sleep(2000);
		
		WebElement register=driver.findElement(By.xpath("//a[text()='register']"));
		register.click();
		
		Thread.sleep(5000);
		
		WebElement firstname=driver.findElement(ByCssSelector.name("#firstname"));
		firstname.click();
		firstname.sendKeys("cheryl");
		
		WebElement lastname=driver.findElement(ByCssSelector.name("#lastname"));
		lastname.click();
		lastname.sendKeys("Raymond");
		
		WebElement emailfield=driver.findElement(ByCssSelector.id("#Email"));
		emailfield.click();
		emailfield.sendKeys("cheryraymond@gmail.com");
		
		WebElement newpasswordfield=driver.findElement(ByCssSelector.id("#password"));
		newpasswordfield.click();
		newpasswordfield.sendKeys("123456kkj");
		WebElement createaccount=driver.findElement(ByCssSelector.id("#EMAIL_REG_FORM_SUBMIT"));
		createaccount.click();
		
		
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		String gettitle=driver.getTitle();
		System.out.println(gettitle);
		
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
