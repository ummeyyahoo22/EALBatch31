package My_Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sel_12_Task_Utilits {
	
	static WebDriver driver;
	public static void IBrowsers(String NameOfBrowser, String url) throws InterruptedException {
		String ud=System.getProperty("user.dir");
		System.out.println(ud);
		if(NameOfBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.chrome.driver",ud+ "\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(url);
			
			
		}
		else if(NameOfBrowser.equalsIgnoreCase("edge")) {
			System.setProperty("WebDriver.edge.driver", ud+"\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(url);
			
		}
	}
	public static void ScreenShot() throws IOException {
		String ud=System.getProperty("user.dir");
		Date filedateformate=new Date();
		String Dfile=filedateformate.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dfile);
		File homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(homepage, new File(ud+"\\Screenshot\\hyrtutorials"+Dfile+"homescreenshot.jpg"));
	}
	
	

}
