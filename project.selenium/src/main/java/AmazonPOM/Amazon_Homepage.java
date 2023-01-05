package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Homepage {
	WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox") WebElement searchbar;
	@FindBy(linkText = "//a[text()='Very Merry Deals]")WebElement verymerrydeals;
	@FindBy(id = "nav-search-submit-button")WebElement searchicon;
	
	public void sendkeysonSearchbar(String searchitem) {
		searchbar.click();
		searchbar.clear();
		searchbar.sendKeys(searchitem);
	}
	public void verymerryclick() {
		
	}
	public void searchicon_click() {
		searchicon.click();
	}
	
	public Amazon_Homepage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

}
