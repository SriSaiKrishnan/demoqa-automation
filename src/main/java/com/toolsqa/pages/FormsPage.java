package com.toolsqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.toolsqa.base.BasePage;

import io.qameta.allure.Step;

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
	
	@FindBy(id = "gender-radio-1")
	private WebElement genderRadio;
	
	@FindBy(id = "hobbies-checkbox-1")
	private WebElement hobbies;
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath = "//div[@id='subjectsContainer']//div//div")
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
	
	public void wait(WebElement element) {
		WebDriverWait driverWait =  new WebDriverWait(driver, 30);
		driverWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	@Step
	public FormsPage clickOnForms() {
		forms.click();
		privateForms.click();
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterLastName(String lastname) {
		lastName.sendKeys(lastname);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterEmailId(String emailid) {
		userEmail.sendKeys(emailid);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterMobileNum(String mobNum) {
		userNumber.sendKeys(mobNum);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterSubjects(String subject) {
		wait(subjectContainer);
		String js = "arguments[0].setAttribute('value','"+subject+"')";
		((JavascriptExecutor) driver).executeScript(js, subjectContainer);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage uploadPicture(String path) {
		uploadPicture.sendKeys(path);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterAddress(String address) {
		currentAddress.sendKeys(address);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterDOB(String date) {
		dob.sendKeys(date);
		state.sendKeys(Keys.TAB);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterState(String State) {
		state.sendKeys(State);
		state.sendKeys(Keys.ENTER);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage enterCity(String City) {
		city.sendKeys(City);
		city.sendKeys(Keys.ENTER);
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage selectGender() {
		genderRadio.click();
		return new FormsPage(driver);
	}
	
	@Step
	public FormsPage selectHobbies() {
		hobbies.click();
		return new FormsPage(driver);
	}

	@Step
	public FormsPage clickOnSubmit() {
		submit.click();
		return new FormsPage(driver);
	}

}
