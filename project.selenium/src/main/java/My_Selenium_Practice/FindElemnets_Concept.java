package My_Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElemnets_Concept {
	static WebDriver driver;
    

	public static void main(String[] args) throws InterruptedException {
		
		Ibrowsers("chrome", "https://www.amazon.com/");
		
		List<WebElement> allbtns=driver.findElements(By.linkText("Amazon Basics2"));
		
		int numberofelements=allbtns.size();
		
		if(numberofelements==1) {
			driver.findElement(By.linkText("Amazon Basic")).click();
			
		}
		else {
			System.out.println("Amazon basics has been changed or multiple element found");
		}
		System.out.println("THis is ");
		
		
		List<WebElement> alllinkselements=driver.findElements(By.tagName("a"));
		System.out.println(alllinkselements);
		
		for(int i=0;i<alllinkselements.size();i++) {
			System.out.println("Text of the elements="+alllinkselements.get(i).getText());
			System.out.println("Get the link of the element="+alllinkselements.get(i).getAttribute("href"));
		}
		
		
		
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
