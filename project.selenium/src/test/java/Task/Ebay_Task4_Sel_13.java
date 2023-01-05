package Task;

import org.testng.annotations.Test;

import Ebay_Task_POM.Ebay_HomePage_POM;
import UtilitiesPack.Ebay_Utilities;

public class Ebay_Task4_Sel_13 extends Ebay_Utilities{
  @Test
  public void firsttest() throws InterruptedException {
	  Ebay_HomePage_POM ob=new Ebay_HomePage_POM(driver);
	  ob.backandforwardbutton();
	  Thread.sleep(5000);
	  ob.currenturl();
	  Thread.sleep(5000);
	  ob.myebay_flash();
	  Thread.sleep(3000);
	  ob.drawborsermyebay();
	  Thread.sleep(3000);
	  ob.movetomyebay();
	  Thread.sleep(3000);
	 // ob.summarywait();
	  ob.summaryclick();
	  Thread.sleep(3000);
	  ob.currenturlone();
	  Thread.sleep(3000);
	  ob.backclick();
	  Thread.sleep(2000);
	  
  }
  @Test(dependsOnMethods = "firsttest")
  public void secondtest() throws InterruptedException {
	  Ebay_HomePage_POM on=new Ebay_HomePage_POM(driver);
	  Thread.sleep(5000);
	  on.explicitallcatagories();
	  Thread.sleep(3000);
	  on.all_catagories();
	  Thread.sleep(2000);
	  on.pagelinks();
	  Thread.sleep(3000);
	  on.selectbooks();
	  Thread.sleep(3000);
	  on.scrolldownpage();
	  Thread.sleep(5000);
	  on.scrolltoelement();
	  Thread.sleep(3000);
	  on.searchbarclick();
	  Thread.sleep(2000);
	  on.searchbarsendkey();
	  Thread.sleep(2000);
	  on.geturl();
	  Thread.sleep(2000);
  }
  @Test(dependsOnMethods = "secondtest")
  public void thirdtest() throws InterruptedException {
	  Ebay_HomePage_POM om=new Ebay_HomePage_POM(driver);
	  om.shop_categories_click();
	  Thread.sleep(2000);
	  om.motors_click();
	  Thread.sleep(5000);
	  om.childwindow();
	  Thread.sleep(5000);
	  om.registerclick();
	  Thread.sleep(5000);
	  om.sessionsids();
	  Thread.sleep(5000);
	  om.pagetitle();
	  Thread.sleep(5000);
  }
 
}
