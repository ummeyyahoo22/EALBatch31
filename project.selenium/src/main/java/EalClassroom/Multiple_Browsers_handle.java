package EalClassroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Browsers_handle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		Ibrowsers("chrome", "https://www.amazon.com/");
		driver.close();

		
		
	}
	
	
	static public void Ibrowsers(String NameOfBrowser,String url) throws InterruptedException {
		if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.getProperty("WebDriver.msedge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
			
			driver=new EdgeDriver();
			
			driver.get("https://www.amazon.com/");
			
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			driver.get(url);
			}
			
			else if(NameOfBrowser.equalsIgnoreCase("Chrome")) {
				System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
				
				driver=new ChromeDriver();
				
				Thread.sleep(3000);
				
				driver.get("https://www.amazon.com/");
				
				Thread.sleep(5000);
				
				driver.manage().window().maximize();
				driver.get(url);
			}
			
		}
	}

