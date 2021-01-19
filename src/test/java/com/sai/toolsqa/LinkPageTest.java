package com.sai.toolsqa;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.toolsqa.base.BasePage;
import com.toolsqa.pages.LinksPage;

public class LinkPageTest {
	
	public Properties prop;
	public BasePage basePage;
	public WebDriver driver;
	public LinksPage linksPage;
	
	@BeforeMethod
	public void setup() {
		basePage = new BasePage();
		prop = basePage.intialize_Properties();
		driver = basePage.intialize_webDriver();
		driver.get(prop.getProperty("url"));
		linksPage = new LinksPage(driver);
	}
	
	@Test
	public void testOne() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnHomeLink();
	}
	
	@Test
	public void testTwo() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnForbiddenLink();
		assertEquals("Forbidden", linksPage.getResponse());
	}
	
	@Test
	public void testThree() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnCreatedLink();
		assertEquals("Created", linksPage.getResponse());
	}
	
	@Test
	public void testFour() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnNoContentLink();
		assertEquals("No Content", linksPage.getResponse());
	}
	
	@Test
	public void testFive() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnMovedLink();
		assertEquals("Moved Permanently", linksPage.getResponse());
	}
	
	@Test
	public void testSix() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnBadRequestLink();
		assertEquals("Bad Request", linksPage.getResponse());
	}
	
	@Test
	public void testSeven() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnUnauthorizedLink();
		assertEquals("Unauthorized", linksPage.getResponse());
	}
	
	@Test
	public void testEight() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnNotFoundLink();
		assertEquals("Not Found", linksPage.getResponse());
	}
	
	@Test
	public void TestNine() {
		linksPage.clickOnElements();
		linksPage.clickOnLinks();
		linksPage.clickOnDynamicLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
