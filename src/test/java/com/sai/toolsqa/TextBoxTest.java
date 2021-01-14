package com.sai.toolsqa;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.toolsqa.base.BasePage;
import com.toolsqa.listeners.TestAllureListener;
import com.toolsqa.pages.TextBoxPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(TestAllureListener.class)
public class TextBoxTest {

	public Properties prop;
	public WebDriver driver;
	public BasePage basePage;
	public TextBoxPage textBoxPage;

	@BeforeMethod
	public void setup() {
		basePage = new BasePage();
		prop = basePage.intialize_Properties();
		driver = basePage.intialize_webDriver();
		driver.get(prop.getProperty("url"));
		textBoxPage = new TextBoxPage(driver);
	}

	@Test(priority=1, description = "Enter the values in the TextBox")
	@Severity(SeverityLevel.NORMAL)
	@Description("Text box practice")
	public void textBoxTest1() {
		textBoxPage.clickElement();
		textBoxPage.clickOnTextBox();
		textBoxPage.enterFullname("Sai Krishnan");
		textBoxPage.enterEmail("krishnansai99@gmail.com");
		textBoxPage.enterCurrentAddress("ABC Street");
		textBoxPage.enterPermanentAddress("XYZ Street");
		textBoxPage.clickOnSubmit();
		assertEquals("Name:Sai Krishnan", textBoxPage.getUsername());
		assertEquals("Email:krishnansai99@gmail.com", textBoxPage.getEmail());
		assertEquals("Current Address :ABC Street", textBoxPage.getCurrentAddress());
		assertEquals("Permananet Address :XYZ Street", textBoxPage.getPermanentAddress());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
