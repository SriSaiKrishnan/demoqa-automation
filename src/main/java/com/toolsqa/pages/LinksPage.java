package com.toolsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.toolsqa.base.BasePage;

import io.qameta.allure.Step;

public class LinksPage extends BasePage {
	
	@FindBy(xpath = "//h5[text() = 'Elements']")
	private WebElement element;
	
	@FindBy(xpath = "//span[text()='Links']")
	private WebElement links;
	
	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(id = "dynamicLink")
	private WebElement dynamicLink;
	
	@FindBy(linkText = "Created")
	private WebElement created;
	
	@FindBy(linkText = "No Content")
	private WebElement noContent;
	
	@FindBy(linkText = "Moved")
	private WebElement moved;
	
	@FindBy(linkText = "Bad Request")
	private WebElement badRequest;
	
	@FindBy(linkText = "Unauthorized")
	private WebElement unAuthorized;
	
	@FindBy(linkText = "Forbidden")
	private WebElement forbidden;
	
	@FindBy(linkText = "Not Found")
	private WebElement notFound;
	
	@FindBy(xpath = "//p[@id='linkResponse']//b//following-sibling::b")
	private WebElement linkResponse;
	
	public LinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void wait(WebElement  element) {
		WebDriverWait driverWait = new WebDriverWait(driver, 20);
		WebElement ele=driverWait.until(ExpectedConditions.visibilityOf(element));
	}
	
	@Step
	public LinksPage clickOnElements() {
		element.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnLinks() {
		links.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnHomeLink() {
		home.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnDynamicLink() {
		dynamicLink.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnCreatedLink() {
		created.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnNoContentLink() {
		noContent.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnMovedLink() {
		moved.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnBadRequestLink() {
		badRequest.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnUnauthorizedLink() {
		unAuthorized.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnForbiddenLink() {
		forbidden.click();
		return new LinksPage(driver);
	}
	
	@Step
	public LinksPage clickOnNotFoundLink() {
		notFound.click();
		return new LinksPage(driver);
	}
	
	@Step
	public String getResponse() {
		wait(linkResponse);
		return linkResponse.getText();
	}

}
