package com.sai.toolsqa;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.toolsqa.base.BasePage;
import com.toolsqa.pages.DynamicPropertiesPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class DynamicPropertiesTest {
	
	public WebDriver driver;
	public Properties prop;
	public BasePage basePage;
	public DynamicPropertiesPage dynamicPropertiesPage;
	
	@BeforeMethod
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.intialize_Properties();
		driver = basePage.intialize_webDriver();
		driver.get(prop.getProperty("url"));
		dynamicPropertiesPage = new DynamicPropertiesPage(driver);
	}
	
	@Test(priority=1, description = "Click on button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Click on button")
	public void testOne() {
		dynamicPropertiesPage.clickOnElements();
		dynamicPropertiesPage.scroll();
		dynamicPropertiesPage.clickOnDynamicProperties();
		dynamicPropertiesPage.clickOnEnableAfter();
	}
	
	@Test(priority=1, description = "Click on button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Click on button")
	public void testTwo() {
		dynamicPropertiesPage.clickOnElements();
		dynamicPropertiesPage.scroll();
		dynamicPropertiesPage.clickOnDynamicProperties();
		dynamicPropertiesPage.clickOnVisibleAfter();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
