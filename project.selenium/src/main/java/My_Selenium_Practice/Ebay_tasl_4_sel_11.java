package My_Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Ebay_tasl_4_sel_11 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Ibrowsers("edge", "https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Screenshotsebay();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		if(currenturl.equals("https://www.ebay.com/")) {
			System.out.println("currenturl is correct according to requirements");
		}
		else {
			System.out.println("currenturl is not correct");
		}
		Thread.sleep(3000);
		WebElement myebay=driver.findElement(By.xpath("(//a[@class='gh-eb-li-a gh-rvi-menu'])[1]"));
		Actions acct=new Actions(driver);
		acct.moveToElement(myebay).build().perform();
		Screenshotsebay();
		
		WebElement summary=driver.findElement(By.xpath("//a[text()=' Summary']"));
		summary.click();
		Thread.sleep(3000);
		String currenturl1=driver.getCurrentUrl();
		System.out.println(currenturl1);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement allcatagories=driver.findElement(By.xpath("//select[@class='gh-sb ']"));
//		allcatagories.click();
		
//		WebElement books=driver.findElement(By.xpath("//a[@class='scnd' and text()='Parts & accessories']"));
		Select account=new Select(allcatagories);
		account.selectByValue("267");
		Thread.sleep(3000);
		WebElement searchfield=driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		searchfield.click();
		searchfield.sendKeys("Qa testing Books");
		WebElement search=driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']"));
		search.click();
		Thread.sleep(3000);
	
		
		String currenturl2=driver.getCurrentUrl();
		System.out.println(currenturl2);
		Thread.sleep(3000);
		
		
		WebElement shopbycategories=driver.findElement(By.xpath("//button[@id='gh-shop-a']"));
		shopbycategories.click();
		Thread.sleep(3000);
		
		WebElement motors=driver.findElement(By.xpath("//a[text()='Motors']"));
		Actions acct1=new Actions(driver);
		acct1.keyDown(Keys.SHIFT).build().perform();
		motors.click();
		Screenshotsebay();
		
	Set<String> WindowsID          =driver.getWindowHandles();
	Iterator<String> It1= WindowsID.iterator();
		
	String SID1=It1.next();
	String SID2=It1.next();
	System.out.println(SID1);
	System.out.println(SID2);
	
	driver.switchTo().window(SID2);
	
	
	driver.switchTo().window(SID1);
	Thread.sleep(6000);
	WebElement register=driver.findElement(By.cssSelector("span[id='gh-ug-flex']>a"));
	register.click();
	
	WebElement firstnme=driver.findElement(By.xpath("//input[@id='firstname']"));
	firstnme.click();
	firstnme.sendKeys("abctech");
	
	WebElement lastname=driver.findElement(By.cssSelector("input[id='lastname']"));
	lastname.click();
	lastname.sendKeys("company");
	
	WebElement emailfield=driver.findElement(By.cssSelector("input[id='Email']"));
	emailfield.click();
	emailfield.sendKeys("abctech@gmail.com");
	
	WebElement passwordfield=driver.findElement(By.cssSelector("input[id='password']"));
	passwordfield.click();
	passwordfield.sendKeys("abc12345");
	
	Screenshotsebay();
	
	
	WebElement createaccount=driver.findElement(By.cssSelector("button[name='EMAIL_REG_FORM_SUBMIT']"));
	createaccount.click();
	
	driver.getWindowHandles();
	
	
	
		
//driver.close();
		

	}
	public static void Ibrowsers(String NameofBrowser, String url) throws InterruptedException {
		if(NameofBrowser.equalsIgnoreCase("chrome")) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(url);
		
		
			
	}
	else if(NameofBrowser.equalsIgnoreCase("edge")) {
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(url);
		
		
	}
		
		
	}
	public static void Screenshotsebay() throws IOException {
		Date dateformate=new Date();
		String Dfile=dateformate.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dfile);
		File homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(homepage, new File("C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Screenshot\\Ebay\\"+Dfile+"ebayscreenshot.jpg"));
	}
}

	

