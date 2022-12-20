package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Texthandling_Facebook {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement textelment=driver.findElement(By.cssSelector("._8eso"));
		String textfromfacebook=textelment.getText();
		System.out.println(textfromfacebook);
		
		String frstext="Connect with friends";
		
		if(textelment.equals(frstext)) {
			System.out.println("text is according to frs");
		}
		else  {
			System.out.println("this is incorrect");
			}
		
		

}
}
