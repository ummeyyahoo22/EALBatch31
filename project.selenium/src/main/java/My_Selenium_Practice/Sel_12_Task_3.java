package My_Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_12_Task_3 {
	
	static WebDriver driver;
	 static WebDriverWait oi;

	public static void main(String[] args) throws InterruptedException, IOException {
		IBrowsers("chrome", "https://www.amazon.com/");
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		if(currenturl.equals("https://www.amazon.com/"))
			System.out.println("current url is  correct according to requirement");
	else {
			System.out.println("currect url is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement accountandlist=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Sel_12_JavaScriptsUtilities.drawBorder(driver, accountandlist);
		ScreenShot();
		Actions acct=new Actions(driver);
		acct.moveToElement(accountandlist).build().perform();
		Thread.sleep(3000);
		
		WebElement startselling=driver.findElement(By.xpath("(//span[text()='Start a Selling Account'])[1]"));
		Sel_12_JavaScriptsUtilities.drawBorder(driver, startselling);
		acct.keyDown(Keys.SHIFT).build().perform();
		startselling.click();
		acct.keyUp(Keys.UP ).build().perform();
		Thread.sleep(5000);
		Set<String> windowsSID=driver.getWindowHandles();
		Iterator<String> it1=windowsSID.iterator();
	
		String SID1=it1.next();
		String SID2=it1.next();
		System.out.println(SID1);
		System.out.println(SID2);
		Thread.sleep(3000);
		driver.switchTo().window(SID2);
		
		List<WebElement> allbutton=driver.findElements(By.tagName("button"));
		System.out.println(allbutton.size());
		
		WebElement searchfield=driver.findElement(By.cssSelector("div[class='nav-search-field ']>input"));
		searchfield.click();
		searchfield.sendKeys("Phones");
		
		Thread.sleep(3000);
		acct.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(3000);
		acct.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(3000);
		acct.keyUp(Keys.UP).build().perform();
		WebElement searchicon=driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
		searchicon.click();
		
		Thread.sleep(3000);
		
		oi=new WebDriverWait(driver, Duration.ofSeconds(30));
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span)[1]")));
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span)[1]"));
		Thread.sleep(3000);
		String amazonphonetext=text.getText();
	System.out.println(amazonphonetext);
	if(amazonphonetext.equals("1-16 of over 10,000")) {
		System.out.println("the text is correct according to frs");
	}
	else {
		System.out.println("the text is not correct");
	}
		
		List<WebElement> all_link=driver.findElements(By.tagName("a"));
		System.out.println( all_link.size());
		
		for(int i=0; i< all_link.size();i++) {
			System.out.println("Text of the link is:"+ all_link.get(i).getText());
			System.out.println("the link is:"+ all_link.get(i).getAttribute("href"));
		}
		driver.switchTo().window(SID2);
		WebElement scrolldowntoelement=driver.findElement(By.xpath("//h3[text()='Your success supported']"));
		Sel_12_JavaScriptsUtilities.scrollIntoView(scrolldowntoelement, driver);
		Sel_12_JavaScriptsUtilities.drawBorder(driver, scrolldowntoelement);
		ScreenShot();
		Thread.sleep(3000);
		Sel_12_JavaScriptsUtilities.scrollPageDown(driver);
		Thread.sleep(3000);
		String Curl=driver.getCurrentUrl();
		System.out.println(Curl);
		
		Sel_12_JavaScriptsUtilities.generateAlert(driver, Curl);
		
		ScreenShot();
		driver.switchTo().alert().accept();
		driver.switchTo().window(SID1);
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		


		driver.navigate().refresh();
		
		
		 oi=new WebDriverWait(driver, Duration.ofSeconds(30));
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[id='searchDropdownBox']")));
		
		
	
	
		
		
		driver.quit();
		

	}
	public static void IBrowsers(String NameOfBrowser, String url) throws InterruptedException {
		if(NameOfBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(NameOfBrowser.equalsIgnoreCase("edge")) {
			System.setProperty("WebDriver.edge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.get(url);

}
	}
	public static void ScreenShot() throws IOException {
			
			Date objects=new Date();
			//System.out.println(objects);
			String Dfile=objects.toString().replace(" ", "_").replace(":", "_");
			System.out.println(Dfile);
			File Homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(Homepage, new File("C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Screenshot\\Amazon\\"+Dfile+"amazonpagehometwelvetask.jpg"));
		}
	
		

}