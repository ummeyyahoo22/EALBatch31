package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement alertbox=driver.findElement(By.xpath("//button[@id='alertBox']"));
		alertbox.click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		
		WebElement confirmbox=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		confirmbox.click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	
		
		Thread.sleep(3000);
		
		WebElement promptbox=driver.findElement(By.xpath("//button[@id='promptBox']"));
		promptbox.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(6000);
		
		driver.close();
		

}
}