package EalClassroom;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
	
		Ibrowsers("chrome", "https://www.amazon.com/");
		Thread.sleep(3000);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Thread.sleep(5000);
		ScreenShotsforpages();
		ScreenShotsforpages();
		
		
		driver.close();
		
		
		

	}
	
	
			
			
		
public static void Ibrowsers(String Browser_Name, String url) {
	if(Browser_Name.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.get(url);
		
	}
	else if(Browser_Name.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.get(url);
	}
}
public static void ScreenShotsforpages() throws IOException {
	
	Date objects=new Date();
	//System.out.println(objects);
	String Dfile=objects.toString().replace(" ", "_").replace(":", "_");
	System.out.println(Dfile);
	File Homepage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(Homepage, new File("C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Screenshot\\Amazon\\"+Dfile+"amazonpagehome.jpg"));
}
}
