package Ebay_Task_POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import JavaScriptPack.JavaScriptUtilities;

public class Ebay_HomePage_POM {
	WebDriver driver;
	String SID1;
	String SID2;
	@FindBy(xpath = "//a[text()='My eBay']") WebElement myebay;
	@FindBy(xpath = "//a[@class='gh-eb-oa thrd' and text()=' Summary']")WebElement summary;
	@FindBy(xpath = "//select[@class='gh-sb ']")WebElement allcategories;
	@FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']") WebElement searchbar;
	@FindBy(xpath = "//button[text()='Shop by category']")WebElement shopbycategories;
	@FindBy(xpath = "//a[text()='Motors']")WebElement motors;
	@FindBy(xpath = "//a[text()='register']") WebElement register;
	@FindBy(xpath = "//input[@name='firstname']")WebElement firstname;
	@FindBy(xpath = "//input[@name='lastname']")WebElement lastname;
	@FindBy(xpath = "//input[@name='Email']")WebElement emailfield;
	@FindBy(xpath = "//input[@name='password']")WebElement password;
	@FindBy(xpath = "//button[@id='EMAIL_REG_FORM_SUBMIT']")WebElement submitfield;

	
	
	public void backandforwardbutton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(3000);
	}
	public void currenturl() {
		String currenturlhomepage=driver.getCurrentUrl();
		System.out.println(currenturlhomepage);
		if(currenturlhomepage.equals(currenturlhomepage)) {
			System.out.println("current url is correct according to frs");
		}
		else {
			System.out.println("current url is not correct");
		}
	}
	public void myebay_flash() throws InterruptedException {
		JavaScriptUtilities.flash_redColor(myebay, driver);
		Thread.sleep(5000);
		JavaScriptUtilities.flash_blueColor(myebay, driver);
		Thread.sleep(5000);
		JavaScriptUtilities.flash_greenColor(myebay, driver);
		Thread.sleep(5000);
	}
	public void drawborsermyebay() throws InterruptedException {
		JavaScriptUtilities.drawBorder_bluecolor(driver, myebay);
		Thread.sleep(3000);
	}
	public void movetomyebay() {
		Actions acct=new Actions(driver);
		acct.moveToElement(myebay).build().perform();
	//	myebay.click();
	}
//	public void summarywait() {
//		
//		WebDriverWait oi=new WebDriverWait(driver, Duration.ofSeconds(30));
//		oi.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='gh-eb-oa thrd'])[1]")));
//	}
	public void summaryclick() throws InterruptedException {
	
		JavaScriptUtilities.drawBorder_redcolor(driver, summary);
	Thread.sleep(5000);
		JavaScriptUtilities.Jsclick(driver, summary);
	}
	public void currenturlone() {
		String currenturlone=driver.getCurrentUrl();
		System.out.println(currenturlone);
	}
	public void backclick() {
		driver.navigate().back();
	}
	public void explicitallcatagories() {
		WebDriverWait oi=new WebDriverWait(driver, Duration.ofSeconds(30));
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='gh-sb ']")));
		
	}
	public void all_catagories() {
		allcategories.click();
	}
	public void pagelinks() {
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++) {
			System.out.println("the text of the linktext is:"+alllinks.get(i).getText());
		}
	}
	public void selectbooks() {
		Select books=new Select(allcategories);
		books.selectByVisibleText("Books");
	}
	public void scrolldownpage() {
		JavaScriptUtilities.scrollPageDown(driver);
	}
	public void scrolltoelement() {
		JavaScriptUtilities.scrollIntoView(driver, searchbar);
		
	}
	public void searchbarclick() {
		searchbar.click();
	}
	public void searchbarsendkey() {
		searchbar.sendKeys("qa testing book");
	}
	public void geturl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	public void shop_categories_click() {
		shopbycategories.click();
	}
	public void motors_click() throws InterruptedException {
	Actions acct=new Actions(driver);
	acct.keyDown(Keys.SHIFT).build().perform();
	motors.click();
	Thread.sleep(5000);
	acct.keyUp(Keys.SHIFT).build().perform();
		
	}
	public void childwindow() {
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it1=windowids.iterator();
		 SID1=it1.next();
		 SID2=it1.next();
		driver.switchTo().window(SID2);
	}
	public void registerclick() throws InterruptedException {
		register.click();
		Thread.sleep(6000);
		firstname.click();
		Thread.sleep(500);
		firstname.sendKeys("easy");
		Thread.sleep(500);
		lastname.click();
		Thread.sleep(500);
		lastname.sendKeys("automation");
		Thread.sleep(500);
		emailfield.click();
		Thread.sleep(500);
		emailfield.sendKeys("easyautomation@gmail.com");
		Thread.sleep(500);
		password.click();
		Thread.sleep(500);
		password.sendKeys("12345kmnj");
		Thread.sleep(300);
		JavaScriptUtilities.flash_redColor(submitfield, driver);
		Thread.sleep(2000);
		submitfield.click();	
	}
	public void sessionsids() throws InterruptedException {
		System.out.println(SID1);
		System.out.println(SID2);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	public void pagetitle() {
		String gettitle=driver.getTitle();
		System.out.println(gettitle);
	}
	
	public Ebay_HomePage_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
