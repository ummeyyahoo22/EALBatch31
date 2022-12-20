package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Mandatory_Slidetask_01 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement bestseller=driver.findElement(By.linkText("Best Sellers"));
		bestseller.click();
		
		Thread.sleep(6000);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String gettitle=driver.getTitle();
		System.out.println(gettitle);
		
		WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.click();
		searchfield.sendKeys("Photos");
		searchfield.click();
		
		Thread.sleep(6000);
		WebElement seachbutton=driver.findElement(By.id("nav-search-submit-button"));
		seachbutton.click();
		
		String currenturl1=driver.getCurrentUrl();
		System.out.println(currenturl1);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		WebElement searchbox=driver.findElement(By.id("searchDropdownBox"));
		searchbox.click();
		Select searchbox1=new Select(searchbox);
		searchbox1.selectByIndex(2);
		
		Thread.sleep(2000);
		
		searchbox1.selectByVisibleText("Amazon Devices");
		
		Thread.sleep(2000);
		
		searchbox1.selectByValue("search-alias=amazon-pharmacy");
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
