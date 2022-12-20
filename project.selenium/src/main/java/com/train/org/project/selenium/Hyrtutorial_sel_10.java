package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyrtutorial_sel_10 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("WebDriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		Thread.sleep(6000);
		
//		//finding locator with help of following sibling //
//		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).click();
//		
//		driver.findElement(By.xpath("(//input[@type='password']/parent::div)[2]"));
//		
//		driver.findElement(By.xpath("//td[text()='Maria Anders']/parent::tr/parent::tbody"));
//		
//		driver.findElement(By.xpath("//label[text()='Password']/ancestor::div[@class='container']"));
//		
//		driver.findElement(By.xpath("(//td[text()='Maria Anders']/following::input[@type='checkbox'])[1]"));
//		
//		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding::div[@class='container signin']"));
//		
//		Thread.sleep(3000);
		
		//locate a following sibling element with the help of a elder sibling/preceding sibling
		
		WebElement emailfield=driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']"));
		emailfield.click();
		emailfield.sendKeys("easyautomationlab@gmail.com");
		
		
		
		Thread.sleep(6000);
		
		driver.close();
		
		
		
		

	}

}
