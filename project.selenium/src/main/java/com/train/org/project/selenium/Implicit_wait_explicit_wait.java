package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait_explicit_wait {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException, IOException {
		IBrowsers("chrome", "https://www.ebay.com/");
		

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		Thread.sleep(3000);
		screenshot();
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		screenshot();
		
		//explicit wait//
		WebDriverWait oi=new WebDriverWait(driver, Duration.ofSeconds(30));
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Sign in'])[1]")));
		
		
		driver.quit();
		

	}
	public static void IBrowsers(String NameOfBrowser,String url) throws InterruptedException {
		if(NameOfBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(2000);

			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(NameOfBrowser.equalsIgnoreCase("edge")) {
			System.setProperty("WebDriver.edge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(2000);

			driver.manage().window().maximize();
			driver.get(url);
			
			
		}
		
	}
	public static void screenshot() throws IOException {
		
		Date ob=new Date();
		String Dfile=ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dfile);
		File dateFormat=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(dateFormat, new File("C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Screenshot\\Ebay\\"+Dfile+"ebayhome.jpg"));
	}

}
