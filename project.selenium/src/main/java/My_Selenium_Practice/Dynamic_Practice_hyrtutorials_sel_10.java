package My_Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Practice_hyrtutorials_sel_10 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
}
}