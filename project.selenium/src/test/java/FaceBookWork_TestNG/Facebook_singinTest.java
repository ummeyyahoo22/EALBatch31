package FaceBookWork_TestNG;

import org.testng.annotations.Test;

import com.shams.excel.reader.utilities.Xlsx_Reeader_EAL;

import FaceBook_POM.FBHomePage_POM;
import UtilitiesPack.Utilities;

import org.testng.annotations.DataProvider;

public class Facebook_singinTest extends Utilities {
	@Test(dataProvider = "facebooklogindata")
	public void facebook_signuptest(String email, String password) throws InterruptedException {

		FBHomePage_POM ob = new FBHomePage_POM(driver);
		ob.email_fieldaction(email);
		ob.password_fieldAction(password);
		ob.loginbtnclick();
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] facebooklogindata() {
		String Excelfilepath = "C:\\Users\\uddin\\git\\repository\\project.selenium\\TestData\\testdata.xlsx";
		Xlsx_Reeader_EAL reader = new Xlsx_Reeader_EAL(Excelfilepath);
		Object[][] data = reader.getSheetData("FB");
		return data;

	}
}
