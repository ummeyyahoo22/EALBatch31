package EalClassroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBasics {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
	 
	 //browser opens//
	 
	 driver=new ChromeDriver();
	 
	 //maximizing window//
	 
	 
	 driver.manage().window().maximize();
	 
	 //to go to any url
	 driver.get("https://www.amazon.com/");
	 
	 //wait 6seconds
	  Thread.sleep(6000);
	  
	  //window refreshing
	  
	  driver.navigate().refresh();
	  
	  //wait for 3 seconds
	  
	  Thread.sleep(3000);
	  
	  //back button//
	  
	  driver.navigate().back();
	  
	  //wait 2 seconds//
	  
	  Thread.sleep(2000);
	  
	  //forward//
	  
	  
	  driver.navigate().forward();
	  
	  //get session id//
	  
	 String sessionid= driver.getWindowHandle();
	 System.out.println(sessionid);
	 
	 
	 //getting url in consol//
	 
	 String urlofcurrentpage=driver.getCurrentUrl();
	 System.out.println(urlofcurrentpage);
	 
	 //getting the title of the page//
	 
	 String pagetitle=driver.getTitle();
	 System.out.println(pagetitle);
	 
	 
	 
	 
		

	}
	
		
	

}
