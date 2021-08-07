package com.Orangehrm_hybridframework.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="txtusername")
WebElement text_user;

@FindBy(name="txtPassword")
WebElement login8tn;

WebDriver driver;

public LoginPage(WebDriver Idriver) {
	this.driver= Idriver;
	PageFactory.initElements(driver, this);
	
}

public void setUsername(String username) {
	text_user.clear();
	text_user.sendKeys(username);;
}

public void setPassword(String password) {
	text_user.clear();
	text_user.sendKeys(password);;
}
public void clickOnLoginBtn() {
	login8tn.click();
}



}
