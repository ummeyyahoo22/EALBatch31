package EalClassroom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Advance_css_selector {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
	
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		WebElement createanaccount=driver.findElement(By.linkText("Create new account"));
		
		//implicit wait//
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//explicit wait//
		
		WebDriverWait exwait= new WebDriverWait(driver, Duration.ofSeconds(30));
		exwait.until(ExpectedConditions.visibilityOf(createanaccount));
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement emailfield=driver.findElement(By.cssSelector("div[class=_6lux]>input"));
		emailfield.click();
		
		
		
		Screenshot();
		
	
		Screenshot();

}
	
	public static void Screenshot() throws IOException {
		
		Date dateinDateFormat=new Date();
		
		System.out.println(dateinDateFormat);
		
		String Date=dateinDateFormat.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Date);
		
		
		File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(ScreenshotFile, new File("C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Screenshot\\Amazon\\"+Date+"myss.jpg"));
		
	}
}
