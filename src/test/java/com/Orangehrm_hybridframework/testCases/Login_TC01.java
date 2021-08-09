package com.Orangehrm_hybridframework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orangehrm_hybridframework.pageObject.LoginPage;
import com.Orangehrm_hybridframework.testBases.TestBase;

public class Login_TC01 extends TestBase  {
	@Test
	public void loginTC_01() {
		try {
			LoginPage Ip = new LoginPage(driver);
			Ip.setUsername("Admin");
			Ip.setPassword("admin123");
			DashbordPage dp= Ip.clickOnLoginBtn();
		}
		catch(Exception e) {
			
		}
	}
	@Test
	public void loginTC_02() {
		try {
			LoginPage Ip= new LoginPage(driver);
			Ip.setUsername("Adminn");
			Ip.setPassword("admine123");
			Ip.clickOnLoginBtn();
			if (driver.getPageSource().contains("Dashbord")) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false,"Login fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
