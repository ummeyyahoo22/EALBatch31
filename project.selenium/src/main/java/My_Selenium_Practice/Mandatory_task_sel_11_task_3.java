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

public class Mandatory_task_sel_11_task_3 {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException, IOException {
		IBrowsers("edge", "https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		if(currenturl.equals("https://www.amazon.com/")) {
			System.out.println("current url is correct as requirement");
		}
		else {
			System.out.println("current url is not corrent");
			
		}
		String gettitle=driver.getTitle();
		System.out.println(gettitle);
		if(gettitle.equals(gettitle)) {
			System.out.println("title is correct according to requirement");
		}
		else {
			System.out.println("title is not corrent");
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement accountandlists=driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
		Actions acct=new Actions(driver);
		acct.moveToElement(accountandlists).build().perform();
		ScreenshotsAMZN();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement startselling=driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(15) > span"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		startselling.click();
		ob.keyUp(Keys.UP ).build().perform();
		Thread.sleep(5000);
		
		Set<String> windowsSID=driver.getWindowHandles();
		Iterator<String> it1=windowsSID.iterator();
	
		String SID1=it1.next();
		String SID2=it1.next();
		System.out.println(SID1);
		System.out.println(SID2);
		Thread.sleep(3000);
		driver.switchTo().window(SID2);
		
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
		
//		WebElement text=driver.findElement(By.cssSelector("div[class='a-section a-spacing-small a-spacing-top-small']>span:first-of-type"));
//		String textfromamazonphone=text.getText();
//		System.out.println(textfromamazonphone);
//		String firsttext="1-16 of over 100,000";
//		if(text.equals(firsttext)) {
//			System.out.println("text is correct according to frs");
//		}
//		else {
//			System.out.println("text is not correct");
//		}
		
		String currenturl2=driver.getCurrentUrl();
		System.out.println(currenturl2);
		
		driver.navigate().back();
		driver.switchTo().window(SID1);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		WebElement allbuttons=driver.findElement(By.cssSelector("select[id='searchDropdownBox']"));
		allbuttons.click();
		

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select obg=new Select(allbuttons);
		obg.selectByIndex(2);
		
		
		acct.keyDown(Keys.CONTROL).sendKeys("p").build().perform();
		Thread.sleep(4000);
		acct.keyUp(Keys.UP).build().perform();
		Thread.sleep(3000);
		
		WebElement all=driver.findElement(By.cssSelector("i[class='hm-icon nav-sprite']"));
		all.click();
		WebElement newrelease=driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(3) > a"));
		newrelease.click();
		
		Thread.sleep(3000);
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
	public static void ScreenshotsAMZN() throws IOException {
		Date dateformate=new Date();
		String Dfile=dateformate.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dfile);
		File homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(homepage, new File("C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Screenshot\\Amazon\\"+Dfile+"amazon.jpg"));
	}
}