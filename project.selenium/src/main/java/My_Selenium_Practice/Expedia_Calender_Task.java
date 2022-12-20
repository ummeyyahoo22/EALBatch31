package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Expedia_Calender_Task {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("WebDriver.msedge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
		driver.get("https://www.expedia.com/Flights");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		WebElement leavingfrom=driver.findElement(By.xpath("//button[@aria-label='Leaving from']"));
		leavingfrom.click();
		Thread.sleep(3000);
		WebElement whereareyouleaving=driver.findElement(By.xpath("//input[@placeholder='Where are you leaving from?']"));
		whereareyouleaving.click();
		whereareyouleaving.sendKeys("jfk");
		
		Thread.sleep(3000);
		WebElement goingto=driver.findElement(By.xpath("//button[@aria-label='Going to']"));
		goingto.click();
		WebElement whereareugoing=driver.findElement(By.xpath("//input[@placeholder='Where are you going to?']"));
		whereareugoing.click();
		whereareugoing.sendKeys("Atlanta");
		
		Thread.sleep(2000);
		WebElement calender=driver.findElement(By.xpath("//button[@id='d1-btn']"));
		calender.click();
		
		Thread.sleep(2000);
		
		WebElement datestartfield=driver.findElement(By.xpath("//button[@aria-label='Dec 14, 2022']"));
		datestartfield.click();
		Thread.sleep(3000);
		
		WebElement dateendfield=driver.findElement(By.xpath("//button[@aria-label='Jan 13, 2023']"));
		dateendfield.click();
		Thread.sleep(3000);
		
		WebElement searchfield=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		searchfield.click();
		
		Thread.sleep(5000);
		
		
		driver.close();
		
		

}
}