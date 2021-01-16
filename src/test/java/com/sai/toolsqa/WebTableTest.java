package com.sai.toolsqa;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.toolsqa.base.BasePage;
import com.toolsqa.listeners.TestAllureListener;
import com.toolsqa.pages.WebTablePage;

@Listeners(TestAllureListener.class)
public class WebTableTest {
	
	public Properties prop;
	public WebDriver driver;
	public BasePage basepage;
	public WebTablePage webTablePage;
	
	@BeforeMethod
	public void setUp() {
		basepage = new BasePage();
		driver = basepage.intialize_webDriver();
		prop = basepage.intialize_Properties();
		driver.get(prop.getProperty("url"));
		webTablePage = new WebTablePage(driver);
	}
	
	@Test
	public void testOne() {
		webTablePage.clickElements();
		webTablePage.clickWebTable();
		webTablePage.clickOnAdd();
		webTablePage.addFirstName("Sai");
		webTablePage.addLastName("Krishnan");
		webTablePage.addEmail("krishnansai99@gmail.com");
		webTablePage.addAge("27");
		webTablePage.addDepartment("IT");
		webTablePage.addSalary("10000");
		webTablePage.clickOnSubmit();
	}
	
	@Test
	public void testTwo() {
		webTablePage.clickElements();
		webTablePage.clickWebTable();
		webTablePage.clickOnEdit();
		webTablePage.addFirstName("Girish");
		webTablePage.addLastName("Akshay");
		webTablePage.addEmail("GirishAkshay@gmail.com");
		webTablePage.addAge("10");
		webTablePage.addDepartment("IT");
		webTablePage.addSalary("15000");
		webTablePage.clickOnSubmit();
	}
	
	@Test
	public void testThree() {
		webTablePage.clickElements();
		webTablePage.clickWebTable();
		webTablePage.clickOnDelete();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
