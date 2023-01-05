package Amazon_task_POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import JavaScriptPack.JavaScriptUtilities;

public class Amazon_Homepage_POM {
	WebDriver driver;
	WebDriverWait oi;
	Actions acct;
	String SID1;
	String SID2;
	
	
	@FindBy(xpath ="//span[text()='Account & Lists']") WebElement acctandtext;
	@FindBy(xpath = "//span[text()='Start a Selling Account']")WebElement startselling;
	@FindBy(id="twotabsearchtextbox")WebElement searchbar;
	@FindBy(id="nav-search-submit-button")WebElement searchbutton;
	
	
	public void currenturl() {
		String currenturlfind=driver.getCurrentUrl();
		System.out.println(currenturlfind);
		if(currenturlfind.equals(currenturlfind)) {
			System.out.println("current url is correct according to FRS");
		}
		else {
			System.out.println("current url is not correct");
		}
	}
	public void waitforacctandlists() {
		 oi=new WebDriverWait(driver, Duration.ofSeconds(30));
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Account & Lists']")));
	}
	public void drawborderacctandlists() {
		JavaScriptUtilities.drawBorder_greencolor(driver, acctandtext);
	}
	

	public void movetoelement() {
		 acct=new Actions(driver);
		acct.moveToElement(acctandtext).build().perform();
	}
	public void startsellingwait() {
		
		oi=new WebDriverWait(driver, Duration.ofSeconds(30));
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Start a Selling Account']")));
	}
	public void startsellingborder() {
		JavaScriptUtilities.drawBorder_redcolor(driver, startselling);
	}
	public void startsellingnewwindow() throws InterruptedException {
		acct.keyDown(Keys.SHIFT).build().perform();
		startselling.click();
		Thread.sleep(1000);
		acct.keyUp(Keys.UP).build().perform();
	}
	public void startsellingwindow() {
		Set<String>windowsids=driver.getWindowHandles();
		Iterator<String>it1=windowsids.iterator();
		 String SID1=it1.next();
		String SID2=it1.next();
		driver.switchTo().window(SID2);
		
	}
	public void startsellingcurrenturl() {
		String currenturl1=driver.getCurrentUrl();
		System.out.println(currenturl1);
		if(currenturl1.equals(currenturl1)) {
			System.out.println("current url is correct according to frs");
		}
		else {
			System.out.println("current url is not correct");
		}
	}
	public void buttons() {
		List<WebElement> buttontag=driver.findElements(By.tagName("button"));
		System.out.println(buttontag.size());
	}
	public void searchbarfind() {
		searchbar.click();
	}
	public void searchbarsendkey() {
		searchbar.sendKeys("phone");
	}
	public void copyphone() throws InterruptedException {
		acct.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(200);
		acct.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(200);
		acct.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(200);
		acct.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(200);
	}
	public void searchbuttonclick() {
		searchbutton.click();
	}


	
	public Amazon_Homepage_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
