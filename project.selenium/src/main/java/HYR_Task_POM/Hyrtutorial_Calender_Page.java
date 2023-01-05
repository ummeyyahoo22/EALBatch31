package HYR_Task_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import JavaScriptPack.JavaScriptUtilities;

public class Hyrtutorial_Calender_Page {
  WebDriver driver;
	@FindBy(xpath = "//a[text()='Selenium Practice']") WebElement seleniumPractice;
	@FindBy(xpath = "//a[text()='Calendars Practice']") WebElement calenderpractice;
	@FindBy(xpath  ="//input[@id='first_date_picker']")WebElement firstdatepick;
	@FindBy(id = "second_date_picker")WebElement seconddatepick;
	@FindBy(id="third_date_picker") WebElement thirddatepick;
	@FindBy(xpath = "//a[text()='1']")WebElement dayselect;
	@FindBy(id="fifth_date_picker")WebElement fifthdatepick;
	@FindBy(id="sixth_date_picker")WebElement sixthdatepick;
	
	
	public void seleniumpracticeclick() throws InterruptedException {
		
JavaScriptUtilities.drawBorder_bluecolor(driver, seleniumPractice);
JavaScriptUtilities.flash_redColor(seleniumPractice, driver);

		seleniumPractice.click();
			
	}
	public void movetoelement() {
		Actions acct=new Actions(driver);
		acct.moveToElement(seleniumPractice);
	}
	public void calenderpractice() {
		JavaScriptUtilities.drawBorder_greencolor(driver, calenderpractice);
		calenderpractice.click();
		
	}
	public void firstdatepick() {
		JavaScriptUtilities.drawBorder_greencolor(driver, firstdatepick);
		JavaScriptUtilities.Jsclick(driver, firstdatepick);
	}
		
		public void selectdate() {
	String date="10/04/2022";
		JavaScriptUtilities.selectdate(driver, firstdatepick, date);
	}
		public void second_date() {
			JavaScriptUtilities.drawBorder_greencolor(driver, seconddatepick);
			seconddatepick.click();
		}
		public void select_second_date() {
			String seconddate="12/31/2022";
			JavaScriptUtilities.selectdate(driver, seconddatepick, seconddate);
		}
		public void thirddateclick() {
			JavaScriptUtilities.Jsclick(driver, thirddatepick);
		}
		public void thirddateselect() {
			String third_date="01/01/2023";
			JavaScriptUtilities.selectdate(driver, thirddatepick, third_date);
		}
		public void fifth_dateclick() {
			JavaScriptUtilities.Jsclick(driver, fifthdatepick);
		}
		public void fifthdateselect() {
			String fifth_date="01/11/2023";
			JavaScriptUtilities.selectdate(driver, fifthdatepick, fifth_date);
		}
		public void first_date_click() {
			firstdatepick.click();
			firstdatepick.clear();
		}
		public void first_date_select() {
			String date_first_again="01/01/2023";
			JavaScriptUtilities.selectdate(driver, firstdatepick, date_first_again);
		}
		public void sixth_date_click() throws InterruptedException {
			JavaScriptUtilities.flash_redColor(sixthdatepick, driver);
			
		}
		public void window_ssid() {
			String ssid=driver.getWindowHandle();
			System.out.println(ssid);
		}
		public void geturl() {
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
		}
	
	
	public Hyrtutorial_Calender_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
