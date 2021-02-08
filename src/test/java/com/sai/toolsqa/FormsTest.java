package com.sai.toolsqa;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.toolsqa.base.BasePage;
import com.toolsqa.listeners.TestAllureListener;
import com.toolsqa.pages.FormsPage;

@Listeners(TestAllureListener.class)
public class FormsTest {
	
	public Properties prop;
	public WebDriver driver;
	public BasePage basePage;
	public FormsPage formsPage;
	
	@BeforeMethod
	public void setup() {
		basePage = new BasePage();
		prop = basePage.intialize_Properties();
		driver = basePage.intialize_webDriver();
	    driver.get(prop.getProperty("url"));
	    formsPage = new FormsPage(driver);
	}
	
	@Test
	public void testOne() {
		formsPage.clickOnForms();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
