package com.Orangehrm_hybridframework.testCases;

import org.testng.annotations.Test;

import com.Orangehrm_hybridframework.pageObject.LoginPage;
import com.Orangehrm_hybridframework.testBases.TestBase;

public class Dashbord_TC001 extends TestBase {
	@Test 
	public void logout_001() {
		LoginPage Ip= new LoginPage(driver);
		Ip.setUsername("Admin");
		Ip.setPassword("admin123");
		DashboardPage dp = Ip.clickOnLoginBtn();
		dp.clickOnLogoutLink();
	}

}
