package com.sai.toolsqa;

import static org.testng.Assert.assertEquals;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.toolsqa.base.BasePage;
import com.toolsqa.listeners.TestAllureListener;
import com.toolsqa.pages.RadioButtonPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(TestAllureListener.class)
public class RadioButtonTest {
	
	public Properties prop;
	public BasePage base;
	public WebDriver driver;
	public RadioButtonPage radiobuttonpage;
	
	@BeforeMethod
	public void setup() {
		base = new BasePage();
		driver = base.intialize_webDriver();
		prop = base.intialize_Properties();
		driver.get(prop.getProperty("url"));
		radiobuttonpage = new RadioButtonPage(driver);
	}
	
	@Test(priority=1, description = "Click on radio button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Radio button practice")
	public void clickYesRadio() {
		radiobuttonpage.clickYes();
		assertEquals("Yes", radiobuttonpage.getResult());
	}
	
	@Test(priority=1, description = "Click on radio button")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Radio button practice")
	public void clickImpressiveRadio() {
		radiobuttonpage.clickImpressive();
		assertEquals("Impressive", radiobuttonpage.getResult());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
