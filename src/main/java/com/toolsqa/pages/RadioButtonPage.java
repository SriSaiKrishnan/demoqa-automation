package com.toolsqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.toolsqa.base.BasePage;

import io.qameta.allure.Step;

public class RadioButtonPage extends BasePage {
	
	@FindBy(xpath = "//h5[text() = 'Elements']")
	private WebElement element;
	
	@FindBy(xpath = "//span[contains(text(),'Radio Button')]")
	private WebElement clickRadioButton;
	
	@FindBy(xpath = "//label[@for='yesRadio' and contains(text(),'Yes')]")
	private WebElement yesRadio;
	
	@FindBy(xpath = "//label[@for='impressiveRadio' and contains(text(),'Impressive')]")
	private WebElement impressiveRadio;
	
	@FindBy(id = "noRadio")
	private WebElement noRadio;
	
	@FindBy(name = "like")
	private WebElement grpRadioButton;
	
	@FindBy(xpath = "//span[@class='text-success']")
	private WebElement testSuccess;
	
	public RadioButtonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Step
	public RadioButtonPage clickYes() {
		element.click();
		clickRadioButton.click();
		boolean select = yesRadio.isSelected();
		if(select == false) {
			waitAndClick(yesRadio);
		}
		return new RadioButtonPage(driver);
	}
	
	@Step
	public RadioButtonPage clickImpressive() {
		element.click();
		clickRadioButton.click();
		boolean select = impressiveRadio.isSelected();
		if(select == false) {
			waitAndClick(impressiveRadio);
		}
		return new RadioButtonPage(driver);
	}
	
	@Step
	public RadioButtonPage clickNo() {
		element.click();
		clickRadioButton.click();
		noRadio.click();
		return new RadioButtonPage(driver);
	}
	
	@Step
	public String getResult() {
		wait(testSuccess);
		return testSuccess.getText();
	}
	
	public void wait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitAndClick(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
