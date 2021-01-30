package com.toolsqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.toolsqa.base.BasePage;

import io.qameta.allure.Step;

public class DynamicPropertiesPage extends BasePage {
	
	@FindBy(xpath = "//h5[text() = 'Elements']")
	private WebElement element;
	
	@FindBy(xpath = "//span[text() = 'Dynamic Properties']")
	private WebElement dynamicProperties;
	
	@FindBy(id = "enableAfter")
	private WebElement enableAfter;
	
	@FindBy(id = "colorChange")
	private WebElement colorChange;
	
	@FindBy(id = "visibleAfter")
	private WebElement visibleAfter;
	
	public DynamicPropertiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	@Step
	public DynamicPropertiesPage clickOnElements() {
		element.click();
		return new DynamicPropertiesPage(driver);
	}
	
	@Step
	public DynamicPropertiesPage clickOnDynamicProperties() {
		dynamicProperties.click();
		return new DynamicPropertiesPage(driver);
	}
	
	@Step
	public DynamicPropertiesPage clickOnEnableAfter() {
		wait(enableAfter);
		enableAfter.click();
		return new DynamicPropertiesPage(driver);
	}
	
	@Step
	public DynamicPropertiesPage clickOnVisibleAfter() {
		wait(visibleAfter);
		visibleAfter.click();
		return new DynamicPropertiesPage(driver);
	}
	
	@Step
	public DynamicPropertiesPage scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		return new DynamicPropertiesPage(driver);
	}
}
