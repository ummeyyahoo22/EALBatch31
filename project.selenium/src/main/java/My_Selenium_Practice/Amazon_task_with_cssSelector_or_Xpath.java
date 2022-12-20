package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_task_with_cssSelector_or_Xpath {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		
		Thread.sleep(3000);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String gettitle=driver.getTitle();
		System.out.println(gettitle);
		
		if(currenturl.equals("https://www.amazon.com/")) {
			System.out.println("currenturl is correct according to requirement");
		}
		else {
			System.out.println("currenturl is not correct");
		}
		
		WebElement signin=driver.findElement(By.xpath("//span[(text()='Hello, sign in')]"));
		Actions acct=new Actions(driver);
		acct.moveToElement(signin).build().perform();
		
		Thread.sleep(4000);
		WebElement musiclibrary=driver.findElement(By.xpath("//span[(text()='Music Library')]"));
		acct.moveToElement(musiclibrary).build().perform();
		musiclibrary.click();
		
		Thread.sleep(3000);
		
		WebElement library=driver.findElement(By.xpath("//*[@name='caretdown']"));
		acct.moveToElement(library).build().perform();
		library.click();
		
		Thread.sleep(3000);
		
		WebElement music=driver.findElement(By.xpath("//*[@id='contextMenuOption1']"));
		acct.moveToElement(music).build().perform();
		music.click();
		
		Thread.sleep(3000);
		WebElement musicfree=driver.findElement(By.xpath("//*[@id='dialogButton2']"));
		acct.moveToElement(musicfree).build().perform();
		musicfree.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		WebElement searchfield=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		searchfield.click();
		searchfield.sendKeys("Phones");
		Thread.sleep(2000);
		WebElement searchfield1=driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
		searchfield1.click();
		
		String getcurrenturl=driver.getCurrentUrl();
		System.out.println(getcurrenturl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		WebElement searchallbutton=driver.findElement(By.xpath("//select[@name='url']"));
		searchallbutton.click();
		Select searchbox=new Select(searchallbutton);
		Thread.sleep(2000);
		searchbox.selectByIndex(2);
		Thread.sleep(3000);
		searchbox.selectByVisibleText("Whole Foods Market");
		
		Thread.sleep(3000);
		searchbox.selectByValue("search-alias=appliances");
		
		Thread.sleep(2000);
		
//		WebElement amazondevices=driver.findElement(By.id("Amazon Devices"));
//		Select devices=new Select(amazondevices);
//		devices.selectByIndex(2);
//		
		//Thread.sleep(3000);
		
		
		driver.close();
		
		
		
		


}
	
}
