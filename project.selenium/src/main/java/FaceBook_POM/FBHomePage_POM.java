package FaceBook_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHomePage_POM {
	public WebDriver driver;
	@FindBy(name = "email") WebElement email_field;
	@FindBy(name = "pass") WebElement password_field;
	@FindBy(name = "login") WebElement login_field;
	
	public void email_fieldaction(String email) throws InterruptedException {
		email_field.click();
		email_field.sendKeys(email);
		Thread.sleep(3000);
		
	}
	public void password_fieldAction(String password) throws InterruptedException {
		password_field.click();
		password_field.clear();
		password_field.sendKeys("password");
		Thread.sleep(3000);
		
	}
	public void loginbtnclick() {
		login_field.click();
	}
	
	public FBHomePage_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
