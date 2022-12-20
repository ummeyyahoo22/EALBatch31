package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender_handling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("WebDriver.msedge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
		driver.get("https://www.expedia.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		WebElement calender=driver.findElement(By.xpath("//button[@id='d1-btn']"));
		calender.click();
		
		Thread.sleep(2000);
		
		WebElement datefrom=driver.findElement(By.xpath("//button[@aria-label='Dec 7, 2022']"));
		datefrom.click();
		
		Thread.sleep(6000);
		
//		WebElement calenderclick=driver.findElement(By.xpath("//button[@id='d2-btn']"));
//		calenderclick.click();
		
	
		
		WebElement dateto=driver.findElement(By.xpath("(//button[@data-day='27'])[2]"));
		dateto.click();
		
		Thread.sleep(4000);
		
		WebElement goingtofield=driver.findElement(By.xpath("//button[@aria-label='Going to']"));
		goingtofield.click();
		Thread.sleep(3000);
		
		WebElement typefield=driver.findElement(By.xpath("//input[@id='location-field-destination']"));
		typefield.click();
		typefield.sendKeys("Boston");
		Thread.sleep(3000);
		
		WebElement searchbutton=driver.findElement(By.xpath("(//div[@class='uitk-typeahead-button-label truncate'])[6]]"));
		searchbutton.click();
		
		WebElement arrowbutton=driver.findElement(By.xpath("(//button[@data-stid='date-picker-paging'])[2]"));
		arrowbutton.click();
		Thread.sleep(3000);
		
		//driver.close();
		

		
	}

}
