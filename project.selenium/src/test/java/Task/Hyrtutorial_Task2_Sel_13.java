package Task;

import org.testng.annotations.Test;

import HYR_Task_POM.Hyrtutorial_alert_Page;
import UtilitiesPack.Utilities_Hyrtutorial;

public class Hyrtutorial_Task2_Sel_13 extends Utilities_Hyrtutorial {
  @Test
  public void f() throws InterruptedException {
	  Hyrtutorial_alert_Page ob=new Hyrtutorial_alert_Page(driver);
	  ob.seleniumPracticeclick();
	  Thread.sleep(2000);
	  ob.movetoelement();
	  Thread.sleep(3000);
	  ob.alertsclick();
	  Thread.sleep(3000);
	  ob.alertboxclick();
	  Thread.sleep(3000);
	  ob.alertboxok();
	  Thread.sleep(3000);
	  ob.confirmboxclick();
	  Thread.sleep(3000);
	  ob.confirmboxdismiss();
	  Thread.sleep(2000);
	  ob.promptboxclick();
	  Thread.sleep(3000);
	  ob.promptboxok();
	  Thread.sleep(2000);
	  ob.buttonsandlinktext();
	  Thread.sleep(3000);
	  
  }
  
}
