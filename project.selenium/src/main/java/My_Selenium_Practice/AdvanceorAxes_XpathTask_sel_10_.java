package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceorAxes_XpathTask_sel_10_ {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		//find locator with help of preceding//
		
		WebElement checkbox=driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding::input[@type='checkbox']"));
		Actions acct=new Actions(driver);
		acct.moveToElement(checkbox).click().build().perform();
		
		Thread.sleep(7000);
		
		//locate parent with help of child
		
		WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox']/parent::td)[1]"));
		checkbox1.click();
//		Actions acct1=new Actions(driver);
//		acct1.moveToElement(checkbox1).click().build().perform();
		
		//locate with help of preceding sibling//
		
		WebElement checkbox2=driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td/child::input"));
		checkbox2.click();
		
		Thread.sleep(6000);
		
		WebElement checkbox3=driver.findElement(By.xpath("(//a[text()='Click']//following::input[@type='checkbox'])[2]"));
		checkbox3.click();
		
		Thread.sleep(3000);
		WebElement checkbox4=driver.findElement(By.xpath("(//table[@id='contactList']/child::tbody/child::tr/child::td/input)[4]"));
		checkbox4.click();
		
		Thread.sleep(3000);
		
//		WebElement checkbox5=driver.findElement(By.xpath("//input[@type='checkbox']/parent::td/parent::tr/parent::tbody"));
//		checkbox5.click();
		
		WebElement checkbox5=driver.findElement(By.xpath("(//td[text()='Canada']/preceding::td/child::input)[5]"));
		checkbox5.click();
		
		Thread.sleep(6000);
		
		WebElement checkbox6=driver.findElement(By.xpath("(//td[text()='Yoshi Tannamuri']/following::input)[1]"));
		checkbox6.click();

		
	
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
