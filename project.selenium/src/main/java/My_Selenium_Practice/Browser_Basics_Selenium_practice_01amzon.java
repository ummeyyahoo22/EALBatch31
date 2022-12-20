package My_Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Basics_Selenium_practice_01amzon {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		//browser opens//
	    driver=new ChromeDriver();
	    
	    //maximizing the browser windows//
	    driver.manage().window().maximize();
	    
	  //get url for any url//
	    driver.get("https://www.amazon.com/");
	    
	    //waiting for web to be opened//we have to mention this in selenium at real job//
	    Thread.sleep(5000);
	    
	    //refreshing browser//
	    driver.navigate().refresh();
	    
	    //waiting//
	    Thread.sleep(3000);
	    
	    //back button//
	    driver.navigate().back();
	    
	    //waiting 4 seconds//
	    Thread.sleep(4000);
	    
	    //forward//
	    driver.navigate().forward();
	    
	    //wait 2 seconds//
	    Thread.sleep(2000);
	    
	    //get session id//
	    String sessionid=driver.getWindowHandle();
	    System.out.println(sessionid);
	    
	    //wait 2 seconds//
	    Thread.sleep(2000);
	    
	    //get url in consol//
	   String geturl= driver.getCurrentUrl();
	   System.out.println(geturl);
	   
	   //1 second wait//
	   Thread.sleep(1000);
	   
	   //get current page//
	   String getcurrentpage=driver.getPageSource();
	   System.out.println(getcurrentpage);
	   
	   //wait 1 second//
	   Thread.sleep(1000);
	   
	   //get title//
	   String gettitle=driver.getTitle();
	   System.out.println(gettitle);
	    
	    //minimizing the browser//
	    driver.manage().window().minimize();

	}
	

}
