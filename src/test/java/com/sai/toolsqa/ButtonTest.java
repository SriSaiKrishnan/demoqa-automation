package com.sai.toolsqa;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.toolsqa.base.BasePage;
import com.toolsqa.pages.ButtonPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ButtonTest {
	
	public Properties prop;
	public WebDriver driver;
	public BasePage basepage;
	public ButtonPage buttonPage;
	
	@BeforeMethod
	public void setup() {
		basepage = new BasePage();
		driver = basepage.intialize_webDriver();
		prop = basepage.intialize_Properties();
		driver.get(prop.getProperty("url"));
		buttonPage = new ButtonPage(driver);
	}
	
	@Test(priority=1, description = "Double Click ")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Double Click practice")
	public void testone() {
		buttonPage.clickOnElements();
		buttonPage.clickOnButtons();
		buttonPage.clickOnDoubleClick();
		assertEquals("You have done a double click", buttonPage.getDoubleClickMessage());
	}
	
	@Test(priority=1, description = "Right Click")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Right Click practice")
	public void testtwo() {
		buttonPage.clickOnElements();
		buttonPage.clickOnButtons();
		buttonPage.clickOnContextClick();
		assertEquals("You have done a right click", buttonPage.getRightClickMessage());
	}
	
	@Test(priority=1, description = "Dynamic Click")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Dynamic Click Practice")
	public void testthree() {
		buttonPage.clickOnElements();
		buttonPage.clickOnButtons();
		buttonPage.clickOnClickMe();
		assertEquals("You have done a dynamic click", buttonPage.getDynamicClickMessage());
	}
	
	@AfterMethod
	public void tearDow() {
		driver.quit();
	}

}
