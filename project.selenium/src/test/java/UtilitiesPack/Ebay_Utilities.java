package UtilitiesPack;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ebay_Utilities {
public  WebDriver driver;
	
	@BeforeClass
	public void browserinitialization() {
		IBrowsers("chrome", "https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	 @AfterClass
	 public void aftermethod() {
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.quit();
	 }
	 
	public  void IBrowsers(String NameOfBrowser, String url) {
		String ud=System.getProperty("user.dir");
		
		if(NameOfBrowser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("WebDriver.chrome.driver", ud+"\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(NameOfBrowser.equalsIgnoreCase("edge")) {
			System.setProperty("WebDriver.edge.driver", ud+"\\Driver\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
	}
	
	
	public  void ScreenShotEbay() throws IOException {
		String ud=System.getProperty("user.dir");
		Date filedateformate=new Date();
		String Dfile=filedateformate.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dfile);
		File homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(homepage, new File(ud+"\\screenshots\\ebay\\"+Dfile+"homescreenshot.jpg"));
	}
	


}


