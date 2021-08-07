package com.Orangehrm_hybridframework.testCases;

import org.testng.annotations.Test;

import com.Orangehrm_hybridframework.pageObject.LoginPage;
import com.Orangehrm_hybridframework.testBases.TestBase;

public class Login_TC01 extends TestBase {
	@Test
	public void loginTC_001() {
		try {
			LoginPage Ip= new LoginPage(driver);
			Ip.setUsername("Admin");
			Ip.setPassword("admin123");
			Ip.clickOnLoginBtn();
		}catch(Exception e) {
		
		System.out.println(e);
	}}

}
