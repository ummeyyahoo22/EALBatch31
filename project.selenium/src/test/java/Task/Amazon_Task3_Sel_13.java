package Task;

import org.testng.annotations.Test;

import Amazon_task_POM.Amazon_Homepage_POM;
import Amazon_task_POM.Amazon_Phonepage_POM;
import Amazon_task_POM.Amazon_parent_Homepage;
import UtilitiesPack.Utilities_Amazon;

public class Amazon_Task3_Sel_13 extends Utilities_Amazon{
  @Test
  public void firsttest() throws InterruptedException {
	  Amazon_Homepage_POM object=new Amazon_Homepage_POM(driver);
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  object.currenturl();
	  object.waitforacctandlists();
	  object.drawborderacctandlists();
	  Thread.sleep(3000);
	  object.movetoelement();
	  Thread.sleep(3000);
	  object.startsellingwait();
	  object.startsellingborder();
	  Thread.sleep(3000);
	  object.startsellingnewwindow();
	  Thread.sleep(3000);
	  object.startsellingwindow();
	  Thread.sleep(3000);
	  object.startsellingcurrenturl();
	  Thread.sleep(2000);
	  object.buttons();
	  Thread.sleep(3000);
	  object.searchbarfind();
	  Thread.sleep(3000);
	  object.searchbarsendkey();
	  Thread.sleep(3000);
	  object.copyphone();
	  Thread.sleep(3000);
	  object.searchbuttonclick();
	  Thread.sleep(3000);
	  
	  
  }
  @Test(dependsOnMethods = "firsttest")
  public void secondtest() throws InterruptedException {
	  Amazon_Phonepage_POM ob=new Amazon_Phonepage_POM(driver);
	  Thread.sleep(2000);
	  ob.textverify();
	  Thread.sleep(3000);
	  ob.alllinksandtext();
	  Thread.sleep(3000);
	  ob.scrolldown();
	  Thread.sleep(2000);
	  
	  
	  
  }
  @Test
  public void thirdtest() throws InterruptedException {
	  Amazon_parent_Homepage om=new Amazon_parent_Homepage(driver);
	  om.backbutton();
	  Thread.sleep(3000);
	  om.parentwindow();
	  Thread.sleep(2000);
	  om.refreshwindow();
	  Thread.sleep(2000);
	  om.all();
	  
	  
  }
  
  
  
}
