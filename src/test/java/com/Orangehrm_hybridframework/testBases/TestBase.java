package com.Orangehrm_hybridframework.testBases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
@BeforeTest
@Parameters({"browser","url"})
public void setUP(@Optional("Opera") String br,@Optional("https://opensource-demo.orangehrmlive.com")String url) {
	if(br.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","D:\\installer\\operadriver_win64\\chromedriver.exe" );
	    driver = new ChromeDriver();
	}
	else if(br.equals("Opera")) {
		WebDriverManager.operadriver().setup();
		System.setProperty("webdriver.opera.driver","D:\\installer\\operadriver_win64\\operadriver.exe");
	}

	else {
		System.out.println("driver dosent match please check again");
	}
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	
}
@AfterMethod
public void tearDown() {
	driver.close();
}

@Test
public void test() {
	
}


}
