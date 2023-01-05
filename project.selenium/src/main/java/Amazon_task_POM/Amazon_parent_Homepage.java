package Amazon_task_POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_parent_Homepage {
	WebDriver driver;
	@FindBy(id = "searchDropdownBox")WebElement dropdownbutton;
	
	
	
	public void backbutton() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void parentwindow() {
		Set<String>windowsids=driver.getWindowHandles();
		Iterator<String>it1=windowsids.iterator();
		 String SID1=it1.next();
		String SID2=it1.next();
		driver.switchTo().window(SID1);
	}
	public void refreshwindow() {
		driver.navigate().refresh();
	}
	public void all() {
		WebDriverWait oi=new WebDriverWait(driver, Duration.ofSeconds(30));
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchDropdownBox")));
	}
	public void dropdownbuttonselect() throws InterruptedException {
		Select acct=new Select(dropdownbutton);
		acct.selectByIndex(3);
		Thread.sleep(2000);
		
	}
	public Amazon_parent_Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
