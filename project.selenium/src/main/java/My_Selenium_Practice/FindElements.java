package My_Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException { 
	
	System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	List<WebElement> all_links=driver.findElements(By.tagName("a"));
	System.out.println(all_links.size());
	
	for(int i=0; i<all_links.size();i++) {
		System.out.println("Text of the link is:"+all_links.get(i).getText());
		System.out.println("the link is:"+all_links.get(i).getAttribute("href"));
	}
	
	
	
	driver.close();


}
}