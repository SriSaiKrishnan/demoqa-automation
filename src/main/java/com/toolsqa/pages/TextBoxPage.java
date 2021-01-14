package com.toolsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toolsqa.base.BasePage;

import io.qameta.allure.Step;

public class TextBoxPage extends BasePage {
	
	@FindBy(xpath = "//h5[text() = 'Elements']")
	private WebElement element;
	
	@FindBy(xpath = "//span[text()='Text Box']")
	private WebElement textbox;
	
	@FindBy(id = "userName")
	private WebElement fullName;
	
	@FindBy(id = "userEmail")
	private WebElement emailId;
	
	@FindBy(id = "currentAddress")
	private WebElement currentAddres;
	
	@FindBy(id = "permanentAddress")
	private WebElement permanentAddres;
	
	@FindBy(id = "submit")
	private WebElement submit;
	
	@FindBy(xpath = "//p[@id='name']")
	private WebElement name;
	
	@FindBy(xpath = "//p[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//p[@id='currentAddress']")
	private WebElement cAddress;
	
	@FindBy(xpath = "//p[@id='permanentAddress']")
	private WebElement pAddress;
	
	public TextBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Step
	public String verifyPageTitle() {
	 return driver.getTitle();
	}
	
	@Step
	public TextBoxPage clickElement() {
		element.click();
		return new TextBoxPage(driver);
	}
	
	@Step
	public TextBoxPage clickOnTextBox() {
		textbox.click();
		return new TextBoxPage(driver);
	}
	
	@Step
	public TextBoxPage enterFullname(String username) {
		fullName.sendKeys(username);
		return new TextBoxPage(driver);
	}
	
	@Step
	public TextBoxPage enterEmail(String email) {
		emailId.sendKeys(email);
		return new TextBoxPage(driver);
	}
	
	@Step
	public TextBoxPage enterCurrentAddress(String currentAddress) {
		currentAddres.sendKeys(currentAddress);
		return new TextBoxPage(driver);
	}
	
	@Step
	public TextBoxPage enterPermanentAddress(String permanentAddress) {
		permanentAddres.sendKeys(permanentAddress);
		return new TextBoxPage(driver);
	}
	
	@Step
	public TextBoxPage clickOnSubmit() {
		submit.click();
		return new TextBoxPage(driver);
	}
	
	@Step
	public String getUsername() {
		return name.getText();
	}
	
	@Step
	public String getEmail() {
		return email.getText();
	}
	
	@Step
	public String getCurrentAddress() {
		return cAddress.getText();
	}
	
	@Step
	public String getPermanentAddress() {
		return pAddress.getText();
	}
}
