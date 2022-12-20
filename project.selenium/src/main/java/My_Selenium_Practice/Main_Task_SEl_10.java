package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main_Task_SEl_10 {
	static WebDriver driver;
     

	public static void main(String[] args) throws InterruptedException {
		
		Ibrowsers("chrome", "https://www.amazon.com/");
		Thread.sleep(3000);
		String getcurrenturl=driver.getCurrentUrl();
		System.out.println(getcurrenturl);
		if(getcurrenturl.equals("https://www.amazon.com/")) {
			System.out.println("Current url is correct according to frs");
		}
		else {
			System.out.println("first statement is not correct");
		}
		
		Thread.sleep(3000);
		
		String gettitle=driver.getTitle();
		System.out.println(gettitle);
		
		if(gettitle.equals(gettitle)) {
			System.out.println("current title is correct according to requirement");
		}
		else {
			System.out.println("first statement is not correct");
		}
		Thread.sleep(3000);
		
		WebElement accountandlists=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions acct=new Actions(driver);
		acct.moveToElement(accountandlists).build().perform();
		WebElement startselling=driver.findElement(By.xpath("//a[@class='nav-link nav-item']/child::span[text()='Start a Selling Account']"));
		startselling.click();
		
		Thread.sleep(3000);
		
		String getcurrenturl1=driver.getCurrentUrl();
		System.out.println(getcurrenturl1);
		if(getcurrenturl.equals("https://www.amazon.com/")) {
			System.out.println("Current url is correct according to frs");
		}
		else {
			System.out.println("first statement is not correct");
		}
		
		Thread.sleep(3000);
		
		String gettitle1=driver.getTitle();
		System.out.println(gettitle1);
		
		if(gettitle.equals(gettitle)) {
			System.out.println("current title is correct according to requirement");
		}
		else {
			System.out.println("first statement is not correct");
		}
		
		
		WebElement searchfield=driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/descendant::input[@id='twotabsearchtextbox']"));
		searchfield.click();
		searchfield.sendKeys("Phones");
		Thread.sleep(3000);
		
		Actions acct1=new Actions(driver);
		acct1.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(3000);
		acct1.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(4000);
		
		WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(6000);
		WebElement allbutton=driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/descendant::select"));
		allbutton.click();
		Select scrolldown=new Select(allbutton);
		scrolldown.selectByIndex(2);
		
		Thread.sleep(3000);
		WebElement searchfield1=driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/descendant::input[@id='twotabsearchtextbox']"));
		searchfield1.click();
		acct1.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		Thread.sleep(3000);
		

         WebElement all=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/child::i[@class='hm-icon nav-sprite']"));
         all.click();
         
         Thread.sleep(3000);
         
         WebElement newrelease=driver.findElement(By.xpath("(//div[@id='hmenu-canvas']/descendant::a[text()='New Releases'])[1]"));
         newrelease.click();
   
        Thread.sleep(6000);
		driver.quit();

		
		
	}
	
	
	static public void Ibrowsers(String NameOfBrowser,String url) throws InterruptedException {
		if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.getProperty("WebDriver.msedge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
			
			driver=new EdgeDriver();
			
			driver.get("https://www.amazon.com/");
			
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			driver.get(url);
			}
			
			else if(NameOfBrowser.equalsIgnoreCase("Chrome")) {
				System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
				
				driver=new ChromeDriver();
				
				Thread.sleep(3000);
				
				driver.get("https://www.amazon.com/");
				
				Thread.sleep(5000);
				
				driver.manage().window().maximize();
				driver.get(url);
			}

}
}