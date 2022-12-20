package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class NewWindow_Open {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		IBrowsers("Chrome", "https://www.amazon.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		screenshotsbestseller();
		Thread.sleep(3000);
		WebElement bestsellers=driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		bestsellers.click();
		
		screenshotsbestseller();
		Thread.sleep(4000);
		Set<String> windowsSID=driver.getWindowHandles();
		Iterator<String> it1=windowsSID.iterator();
		String SID1=it1.next();
		String SID2=it1.next();
		System.out.println(SID1);
		System.out.println(SID2);
		Thread.sleep(3000);
		
		driver.switchTo().window(SID2);
		
		Thread.sleep(5000);
		WebElement amazonbasics=driver.findElement(By.xpath("//a[text()='Amazon Basics']"));
		amazonbasics.click();
		Thread.sleep(6000);
	
		
		driver.quit();
		
		

	}
	public static void IBrowsers(String NameOfBrowser, String url) {
		if(NameOfBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdrver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.get(url);
		}
	 else if(NameOfBrowser.equalsIgnoreCase("edge")) {
		 System.setProperty("webdrver.edge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			driver.get(url);
		}
		
	
	}
	public static void screenshotsbestseller() throws IOException{
		Date ob=new Date();
		String Dfile=ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dfile);
			File datefileformat=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(datefileformat, new File("C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Screenshot\\Amazon\\"+Dfile+"bestsellers.jpg"));
	}	
	
	

}
