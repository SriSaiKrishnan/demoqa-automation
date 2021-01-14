package com.sai.toolsqa;

import static org.testng.Assert.assertEquals;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.toolsqa.base.BasePage;
import com.toolsqa.pages.CheckBoxPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CheckBoxTest {
	
	public WebDriver driver;
	public Properties prop;
	public BasePage basepage;
	public CheckBoxPage checkBoxPage;
	
	@BeforeMethod
	public void setup() {
		basepage = new BasePage();
		driver = basepage.intialize_webDriver();
		prop = basepage.intialize_Properties();
		driver.get(prop.getProperty("url"));
		checkBoxPage = new CheckBoxPage(driver);
	}
	
	@Test(priority = 1, description = "Check the group checkbox")
	@Severity(SeverityLevel.NORMAL)
	@Description("Check the checkbox Desktop")
	public void checkBoxTestOne() {
		checkBoxPage.clickOnElements();
		checkBoxPage.clickOnCheckBox();
		checkBoxPage.expandAll();
		checkBoxPage.checkGroupCheckBox();
		checkBoxPage.collapeAll();
		assertEquals("desktop", checkBoxPage.getDesktopResult());
	}
	
	@Test(priority = 1, description = "Check the single checkbox")
	@Severity(SeverityLevel.NORMAL)
	@Description("Check the checkbox")
	public void checkBoxTestTwo() {
		checkBoxPage.clickOnElements();
		checkBoxPage.clickOnCheckBox();
		checkBoxPage.expandAll();
		checkBoxPage.checkSingleCheckBox();
		checkBoxPage.collapeAll();
		assertEquals("private", checkBoxPage.getPrivateResult());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
