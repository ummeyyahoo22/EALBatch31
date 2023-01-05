package Task;

import org.testng.annotations.Test;

import HYR_Task_POM.Hyrtutorial_Calender_Page;
import JavaScriptPack.JavaScriptUtilities;
import UtilitiesPack.Utilities_Hyrtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class Hyrtutorial_Task1_Sel_13 extends Utilities_Hyrtutorial{
  @Test(priority = 2)
  public void firsttest() throws InterruptedException {
	  
	  Hyrtutorial_Calender_Page on=new Hyrtutorial_Calender_Page(driver);
	  Thread.sleep(3000);
	  on.seleniumpracticeclick();
	  Thread.sleep(3000);
	  on.movetoelement();
	  Thread.sleep(2000);
	  on.calenderpractice();
	  Thread.sleep(5000);
	  on.firstdatepick();
	  Thread.sleep(5000);
	  on.selectdate();
	  Thread.sleep(6000);
	  
  }
  
  
  
	@Test (priority = 1,dependsOnMethods = "firsttest")
	
	public void secondtest() throws InterruptedException, IOException {
		
		 Hyrtutorial_Calender_Page ob=new Hyrtutorial_Calender_Page(driver);
		  Thread.sleep(3000);
		  ob.second_date();
		  Thread.sleep(3000);
		  ob.select_second_date();
		  Thread.sleep(5000);
		  ob.thirddateclick();
		  Thread.sleep(2000);
		  ob.thirddateselect();
		  Thread.sleep(3000);
		  ob.fifth_dateclick();
		  Thread.sleep(3000);
		  ob.fifthdateselect();
		  Thread.sleep(3000);
		  
		  ob.first_date_click();
		  Thread.sleep(3000);
		  ob.first_date_select();
		  Thread.sleep(3000);
		  ob.sixth_date_click();
		  Thread.sleep(3000);
		  ob.window_ssid();
		  Thread.sleep(2000);
		  ob.geturl();
		  Thread.sleep(2000);
		  	
	}

}
