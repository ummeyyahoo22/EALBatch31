package Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class basic {
  @Test
  public void f() {
	  System.out.println("THis is test method annotation");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("THis is beforemethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("THis is aftermethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("THis is beforeclass annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("THis is afterclass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("THis is beforetest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("THis is aftertest annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("THis is beforesuite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("THis is aftersuite annotation");
  }
  public void ummey() {
	  System.out.println("This is normalmethod without any annotation");
  }

}
