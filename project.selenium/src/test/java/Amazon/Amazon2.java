package Amazon;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AmazonPOM.Amazon_Homepage;
import AmazonPOM.Coupons_Page;
import AmazonPOM.MostPopular_page;
import AmazonPOM.VeryMerry_Page;
import UtilitiesPack.Utilities;
import UtilitiesPack.Utilities_Amazon;

public class Amazon2 extends Utilities{
    @Test
	    public void f() {
    	
	  Amazon_Homepage ob=new Amazon_Homepage(driver);
	  ob.sendkeysonSearchbar("phone");
	  ob.verymerryclick();
	  
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	  
	  String firsthomepageUrl="https://www.amazon";
	//  Assert.assertEquals(url, firsthomepageUrl);
	  
	  SoftAssert sft=new SoftAssert();
	  sft.assertEquals(url, firsthomepageUrl);
	  
//	  VeryMerry_Page vp=new VeryMerry_Page(driver);
//	  vp.couponsclick();
//	  
//	  Coupons_Page cp=new Coupons_Page(driver);
//	  cp.mostpopularClick();
	  
	 sft.assertAll();
	  
  }
    @Test
    public void test2() {
    	MostPopular_page mp=new MostPopular_page(driver);
    	mp.logoclick();
    	
    	Amazon_Homepage ob= new Amazon_Homepage(driver);
    	ob.sendkeysonSearchbar("computer");
    	ob.searchicon_click();
    	
    	
    }
  
  
}
