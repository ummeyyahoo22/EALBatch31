package TestNG_Basic_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
  @Test
  public void m3() {
	  System.out.println("m3 from Test2 class");
	  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\uddin\\git\\repository\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
  }
  public void m4() {
	  System.out.println("m4 from Test2 class");
	  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\uddin\\git\\repository\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
  }
}
