package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_control {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("WebDriver.msedge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchfield.click();
		searchfield.sendKeys("Computer");
		Thread.sleep(5000);
		
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("A").build().perform();   //select all(ctrl+A)
		Thread.sleep(6000);
		
		ob.keyDown(Keys.CONTROL).sendKeys("X").build().perform();
		Thread.sleep(3000);
		
		searchfield.click();
		
		ob.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		Thread.sleep(3000);
		ob.keyUp(Keys.CONTROL);
		Thread.sleep(3000);
		ob.keyDown(Keys.CONTROL).sendKeys("A").build().perform();
		Thread.sleep(3000);
		ob.sendKeys(Keys.DELETE).build().perform();
		
		
		
		
		
		
		Thread.sleep(6000);
		
		
		driver.close();
		
		
		
}
}