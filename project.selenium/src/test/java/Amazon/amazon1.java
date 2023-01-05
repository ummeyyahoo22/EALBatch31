package Amazon;

import org.testng.annotations.Test;

import UtilitiesPack.Utilities;
import UtilitiesPack.Utilities_Amazon;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class amazon1 extends Utilities_Amazon{
	
  @Test
  public void f() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
	  
	  
	  driver.close();
  }
 

 
}
