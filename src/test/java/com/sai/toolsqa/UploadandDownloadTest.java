package com.sai.toolsqa;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.toolsqa.base.BasePage;
import com.toolsqa.pages.UploadandDownloadPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class UploadandDownloadTest {
	
	public Properties prop;
	public WebDriver driver;
	public BasePage basePage;
	public UploadandDownloadPage downloadPage;
	
	@BeforeMethod
	public void UploadandDownloadTest() {
		basePage = new BasePage();
		driver = basePage.intialize_webDriver();
		prop = basePage.intialize_Properties();
		driver.get(prop.getProperty("url"));
		downloadPage = new UploadandDownloadPage(driver);
	}
	
	@Test(priority=1, description = "Click on Upload and Download")
	@Severity(SeverityLevel.NORMAL)
	@Description("Click on  Download")
	public void testOne() {
		downloadPage.clickOnElements();
		downloadPage.clickOnUploadDownload();
		downloadPage.clickOnDownload();
	}
	
	@Test(priority=1, description = "Click on Upload and Download")
	@Severity(SeverityLevel.NORMAL)
	@Description("Click on Upload ")
	public void testTwo() {
		downloadPage.clickOnElements();
		downloadPage.clickOnUploadDownload();
		downloadPage.clickOnUpload();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
