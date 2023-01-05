package Amazon_task_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import JavaScriptPack.JavaScriptUtilities;

public class Amazon_Phonepage_POM {
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='1-16 of over 10,000 results for']") WebElement texts;
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")WebElement scrolldowntoelement;
	
	
	public void textverify() {
		String text=texts.getText();
		if(text.equals("1-16 of over 10,000 results for")) {
			System.out.println("the text is correct according to frs");
		}
		
		else {
			System.out.println("the text is not correct");
		}
		
	}
	
	public void alllinksandtext() {
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		for(int i=0;i<alllinks.size();i++) {
			System.out.println("the link texts for the links:"+alllinks.get(i).getText());
		}
	}
	public void scrolldown() throws InterruptedException {
		
		JavaScriptUtilities.scrollIntoView(driver, scrolldowntoelement);
		Thread.sleep(3000);
		JavaScriptUtilities.drawBorder_bluecolor(driver, scrolldowntoelement);
		Thread.sleep(2000);
		JavaScriptUtilities.scrollPageDown(driver);
		Thread.sleep(3000);
		JavaScriptUtilities.alertgenerate(driver, "all task in child window is finished");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	
	public Amazon_Phonepage_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
