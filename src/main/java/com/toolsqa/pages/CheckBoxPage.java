package com.toolsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.toolsqa.base.BasePage;
import io.qameta.allure.Step;

public class CheckBoxPage extends BasePage {
	
	@FindBy(xpath = "//h5[text() = 'Elements']")
	private WebElement element;
	
	@FindBy(xpath = "//span[text()='Check Box']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[@title='Expand all']")
	private WebElement expandAll;
	
	@FindBy(xpath = "//button[@title='Collapse all']")
	private WebElement collapseAll;
	
	@FindBy(xpath = "//span[text()='Desktop']")
	private WebElement groupCheckbox;
	
	@FindBy(xpath = "//span[text()='Private']//preceding-sibling::span[@class='rct-checkbox']")
	private WebElement singleCheckbox;
	
	@FindBy(xpath = "//span[text()='desktop']")
	private WebElement desktopResult;
	
	@FindBy(xpath = "//span[text()='private']")
	private WebElement privateResult;
	
	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Step
	public CheckBoxPage clickOnElements() {
		element.click();
		return new CheckBoxPage(driver);
	}
	
	@Step
	public CheckBoxPage clickOnCheckBox() {
		checkbox.click();
		return new CheckBoxPage(driver);
	}
	
	@Step
	public CheckBoxPage expandAll() {
		expandAll.click();
		return new CheckBoxPage(driver);
	}
	
	@Step
	public CheckBoxPage collapeAll() {
		collapseAll.click();
		return new CheckBoxPage(driver);
	}
	
	@Step
	public CheckBoxPage checkGroupCheckBox() {
		if(!groupCheckbox.isSelected()) {
			groupCheckbox.click();
		}
		return new CheckBoxPage(driver);
	}
	
	@Step
	public CheckBoxPage checkSingleCheckBox() {
		if(!singleCheckbox.isSelected()) {
			singleCheckbox.click();
		}
		return new CheckBoxPage(driver);
	}
	
	@Step
	public String getDesktopResult() {
		return desktopResult.getText();
	}
	
	@Step
	public String getPrivateResult() {
		return privateResult.getText();
	}

}
