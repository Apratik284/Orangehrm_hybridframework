package com.Orangehrm_hybridframework.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Orangehrm_hybridframework.pageObject.LoginPage;
import com.Orangehrm_hybridframework.testBases.TestBase;


@Test (dataProvider= "getData")
public class LoginTC002 extends TestBase{
	public void loginTC002(String uname, String upass) {
		LoginPage login = new LoginPage(driver);
		login.setUsername(uname);
		login.setPassword(upass);
		login.clickOnLoginBtn();
	}
	@DataProvider
	public Object getData() {
		Object[][] data= excelDataProvider.getCelData("Sheet1");
		return data;
	}
	

}
