package HYR_Task_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import JavaScriptPack.JavaScriptUtilities;

public class Hyrtutorial_alert_Page {
	
	WebDriver driver;
	@FindBy(xpath = "//a[text()='Selenium Practice']") WebElement seleniumPractice;
	@FindBy(xpath = "//a[text()='Alerts']") WebElement alerts;
	@FindBy(id="alertBox") WebElement alertbox;
	@FindBy(id="confirmBox")WebElement confirmbox;
	@FindBy(id="promptBox")WebElement promptbox;
	
		public void seleniumPracticeclick() {
			seleniumPractice.click();	
		}
		public void movetoelement() {
				Actions acct=new Actions(driver);
				acct.moveToElement(seleniumPractice);
		}
		public void alertsclick() {
			alerts.click();
		}
		public void alertboxclick() {
			alertbox.click();
		}
		public void alertboxok() {
			driver.switchTo().alert().accept();
			
		}
		public void confirmboxclick() {
			JavaScriptUtilities.Jsclick(driver, confirmbox);
		}
		public void confirmboxdismiss() {
			driver.switchTo().alert().dismiss();
		}
		public void promptboxclick() {
		JavaScriptUtilities.Jsclick(driver, promptbox);	
		}
		public void promptboxok() {
			driver.switchTo().alert().accept();
		}
		public void buttonsandlinktext() {
			List<WebElement>buttons=driver.findElements(By.tagName("button"));
			System.out.println(buttons.size());
			for(int i=0; i<buttons.size();i++) {
			System.out.println("the link of the text is:"+buttons.get(i).getText());	
			}
		}
		
		
		public Hyrtutorial_alert_Page(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
			

}
