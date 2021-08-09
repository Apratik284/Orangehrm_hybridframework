package com.Orangehrm_hybridframework.testBases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@BeforeSuite
public void init() {
	configDataProvider = new configDataProvider();
	excelDataProvider = new ExcelDataProvider();
}
public class TestBase {
	public WebDriver driver;
@BeforeTest
@Parameters({"browser"})
public void setUP(@Optional("Chrome") String br) {
	
	if(br.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver","D:\\installer\\operadriver_win64\\chromedriver.exe" );
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com ");
	}
	else if(br.equals("Opera")) {
		WebDriverManager.operadriver().setup();
//		System.setProperty("webdriver.opera.driver","D:\\installer\\operadriver_win64\\operadriver.exe");
	    driver= new OperaDriver();
	}
	else {
		System.out.println("driver dosent match please check again");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	
}
@AfterMethod
public void tearDown() {
	driver.close();
}

//@Test
//public void test() {
//	
}



