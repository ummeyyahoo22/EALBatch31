package EalClassroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable_jquery {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\uddin\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		WebElement dragstarts=driver.findElement(By.id("draggable"));
		WebElement dropit=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(dragstarts, dropit).build().perform();
		
		driver.switchTo().parentFrame();
		
		WebElement resizable=driver.findElement(By.linkText("Resizable"));
		resizable.click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
