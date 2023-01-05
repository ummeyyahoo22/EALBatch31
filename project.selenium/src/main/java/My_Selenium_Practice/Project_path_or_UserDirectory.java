package My_Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_path_or_UserDirectory {
	static WebDriver driver;

	public static void main(String[] args) {
		
		String ud=System.getProperty("user.dir");
		System.out.println(ud);
		
		System.setProperty("WebDriver.chrome.driver", ud+"\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

	}

}
