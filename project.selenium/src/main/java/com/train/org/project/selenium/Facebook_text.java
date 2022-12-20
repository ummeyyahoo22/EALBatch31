package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_text {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		String text=driver.findElement(By.xpath("//*[contains(text(),'Connect with')]")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		
		driver.close();
		
		

}
}