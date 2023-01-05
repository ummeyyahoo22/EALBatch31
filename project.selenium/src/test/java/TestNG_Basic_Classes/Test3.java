package TestNG_Basic_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
  @Test
  public void m5() {
	  System.out.println("m5 from Test3 class");
	  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\uddin\\git\\repository\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
  }
  public void m6() {
	  System.out.println("m6 from Test3 class");
	  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\uddin\\git\\repository\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
  }
}
