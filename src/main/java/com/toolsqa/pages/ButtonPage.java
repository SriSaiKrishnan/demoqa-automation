package com.toolsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.toolsqa.base.BasePage;
import io.qameta.allure.Step;

public class ButtonPage extends BasePage {
	
	@FindBy(xpath = "//h5[text() = 'Elements']")
	private WebElement element;
	
	@FindBy(xpath = "//span[text()='Buttons']")
	private WebElement button;
	
	@FindBy(id = "doubleClickBtn")
	private WebElement doubleClick;
	
	@FindBy(id = "rightClickBtn")
	private WebElement rightClick;
	
	@FindBy(xpath = "//button[text()='Click Me']")
	private WebElement clickMe;
	
	@FindBy(id = "doubleClickMessage")
	private WebElement dclickMessage;
	
	@FindBy(id = "rightClickMessage")
	private WebElement rclickMessage;
	
	@FindBy(id = "dynamicClickMessage")
	private WebElement dyMessage;
	
	public ButtonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Step
	public ButtonPage clickOnElements() {
		element.click();
		return new ButtonPage(driver);
	}
	
	@Step
	public ButtonPage clickOnButtons() {
		button.click();
		return new ButtonPage(driver);
	}
	
	@Step
	public ButtonPage clickOnDoubleClick() {
		Actions actions =  new Actions(driver);
		actions.doubleClick(doubleClick).perform();
		return new ButtonPage(driver);
	}
	
	@Step
	public ButtonPage clickOnContextClick() {
		Actions actions =  new Actions(driver);
		actions.contextClick(rightClick).perform();
		return new ButtonPage(driver);
	}
	
	@Step
	public ButtonPage clickOnClickMe() {
		Actions actions =  new Actions(driver);
		actions.click(clickMe).perform();
		return new ButtonPage(driver);
	}
	
	@Step
	public String getDoubleClickMessage() {
		return dclickMessage.getText();
	}
	
	@Step
	public String getRightClickMessage() {
		return rclickMessage.getText();
	}
	
	@Step
	public String getDynamicClickMessage() {
		return dyMessage.getText();
	}
}
