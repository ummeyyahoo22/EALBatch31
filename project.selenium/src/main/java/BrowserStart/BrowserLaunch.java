package BrowserStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
	 
	 //browser opens//
	 
	 driver=new ChromeDriver();
	 
	 //maximizing window//
	 
	 
	 driver.manage().window().maximize();
	 
	 //to go to any url
	 driver.get("https://www.amazon.com/");
	}

}
