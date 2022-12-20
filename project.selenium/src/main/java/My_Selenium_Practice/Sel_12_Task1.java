package My_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sel_12_Task1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Sel_12_JavaScriptsUtilities.IBrowsers("chrome", "https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		WebElement seleniumpractice=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		
		Thread.sleep(5000);
		Sel_12_JavaScriptsUtilities.flash(seleniumpractice, driver);
		Sel_12_JavaScriptsUtilities.drawBorder(driver, seleniumpractice);
		


		
		
		driver.close();
	}

}
