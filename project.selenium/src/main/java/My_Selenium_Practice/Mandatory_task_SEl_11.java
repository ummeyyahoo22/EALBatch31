package My_Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Mandatory_task_SEl_11 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.getProperty("WebDriver.msedge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
		
		driver=new EdgeDriver();
		
		driver.get("https://www.expedia.com/Flights");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement leavingfrom=driver.findElement(By.cssSelector("button[type='button'][aria-label='Leaving from']"));
		leavingfrom.click();
		
		WebElement whereareyouleavingfrom=driver.findElement(By.cssSelector("input[id='location-field-leg1-origin']"));
		whereareyouleavingfrom.sendKeys("jfk");
		
		WebElement goingto=driver.findElement(By.cssSelector("button[aria-label='Going to']"));
		goingto.click();
		
		Thread.sleep(3000);
		WebElement whereareyougoingto=driver.findElement(By.cssSelector("input[id='location-field-leg1-destination']"));
		whereareyougoingto.click();
		whereareyougoingto.sendKeys("Atlanta");
		
		WebElement datefield=driver.findElement(By.cssSelector("button[id='d1-btn']"));
		datefield.click();
		
		//WebElement selectdatefrom=driver.findElement(By.cssSelector("td[class='uitk-date-picker-day-number']>button[aria-label='Dec 8, 2022, date disabled']"));
		//selectdatefrom.click();
		Thread.sleep(3000);
		//WebElement selectdateto=driver.findElement(By.cssSelector("button[aria-label='Jan 8, 2023']"));
		//selectdateto.click();
		
		WebElement donebutton=driver.findElement(By.xpath("(//button[text()='Done'])[2]"));
		donebutton.click();
		
		Screenshots();
		
		driver.close();

}
	public static void Screenshots() throws IOException {
		
		Date ob=new Date();
		//System.out.println(ob);
		String obfile=ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(obfile);
		
		File expediascreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(expediascreenshot, new File("C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Screenshot\\Expedia\\"+obfile+"expedia.jpg"));
	}
}