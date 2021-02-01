package com.toolsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toolsqa.base.BasePage;

public class FormsPage extends BasePage {
	
	@FindBy(xpath = "//h5[text() = 'Forms']")
	private WebElement forms;
	
	@FindBy(xpath = "//span[text() = 'Practice Form']")
	private WebElement privateForms;
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "userEmail")
	private WebElement userEmail;
	
	@FindBy(id = "userNumber")
	private WebElement userNumber;
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(id = "subjectsContainer")
	private WebElement subjectContainer;
	
	@FindBy(id = "uploadPicture")
	private WebElement uploadPicture;
	
	@FindBy(id = "currentAddress")
	private WebElement currentAddress;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "submit")
	private WebElement submit;
	
	public FormsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
