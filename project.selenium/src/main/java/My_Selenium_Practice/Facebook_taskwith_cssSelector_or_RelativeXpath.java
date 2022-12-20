package My_Selenium_Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_taskwith_cssSelector_or_RelativeXpath {
	
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
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		if(currenturl.equals("https://www.facebook.com/")) {
			System.out.println("currenturl is correct according to requirement");
		}
		else {
			System.out.println("current url is not correct");
		}
		
		WebElement createaccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
		createaccount.click();
		
		Thread.sleep(5000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.click();
		firstname.sendKeys("quality");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.click();
		lastname.sendKeys("assurance");
		
		WebElement phonenumberfield=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phonenumberfield.click();
		phonenumberfield.sendKeys("5124562115");
		
		WebElement newpasswordfiled=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newpasswordfiled.clear();
		newpasswordfiled.sendKeys("123456mmm");
		
		
		Thread.sleep(2000);
		
		WebElement birthfield=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select birthmonths=new Select(birthfield);
		birthmonths.selectByIndex(5);
		
		WebElement bithdays=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select birthday=new Select(bithdays);
		birthday.selectByVisibleText("28");
		
		WebElement years=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(years);
		year.selectByValue("2010");
		
		Thread.sleep(3000);
		
		WebElement genders=driver.findElement(By.xpath("//input[@class='_8esa']"));
		genders.click();
		
		
		WebElement signupbutton=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signupbutton.click();
		Thread.sleep(6000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(6000);
		
		String webtitle=driver.getTitle();
		System.out.println(webtitle);
		
		Thread.sleep(6000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		driver.close();

	}

}
