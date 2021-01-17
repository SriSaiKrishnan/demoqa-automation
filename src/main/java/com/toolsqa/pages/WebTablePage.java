package com.toolsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.toolsqa.base.BasePage;
import io.qameta.allure.Step;

public class WebTablePage extends BasePage {
	
	@FindBy(id = "addNewRecordButton")
	private WebElement add;
	
	@FindBy(id = "firstName")
	private WebElement firstname;
	
	@FindBy(id = "lastName")
	private WebElement lastname;
	
	@FindBy(id = "userEmail")
	private WebElement email;
	
	@FindBy(id = "age")
	private WebElement age;
	
	@FindBy(id = "salary")
	private WebElement salary;
	
	@FindBy(id = "department")
	private WebElement department;
	
	@FindBy(id = "submit")
	private WebElement submit;
	
	@FindBy(xpath = "//div[contains(text(),'cierra@example.com')]/..//span[@title='Edit']")
	private WebElement edit;
	
	@FindBy(xpath = "//div[contains(text(),'cierra@example.com')]/..//span[@title='Delete']")
	private WebElement delete;
	
	@FindBy(xpath = "//h5[text() = 'Elements']")
	private WebElement element;
	
	@FindBy(xpath = "//span[contains(text(),'Web Tables')]")
	private WebElement clickWebTables;
	
	public WebTablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Step
	public WebTablePage clickElements() {
		element.click();
		return new WebTablePage(driver);
	}

	@Step
	public WebTablePage clickWebTable() {
		clickWebTables.click();
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage clearTextBox(WebElement element) {
		element.clear();
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage clickOnAdd() {
		add.click();
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage addFirstName(String text) {
		clearTextBox(firstname);
		firstname.sendKeys(text);
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage addLastName(String text) {
		clearTextBox(lastname);
		lastname.sendKeys(text);
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage addEmail(String text) {
		clearTextBox(email);
		email.sendKeys(text);
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage addAge(String Age) {
		clearTextBox(age);
		age.sendKeys(Age);
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage addSalary(String Salary) {
		clearTextBox(salary);
		salary.sendKeys(Salary);
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage addDepartment(String text) {
		clearTextBox(department);
		department.sendKeys(text);
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage clickOnSubmit() {
		submit.click();
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage clickOnEdit() {
		edit.click();
		return new WebTablePage(driver);
	}
	
	@Step
	public WebTablePage clickOnDelete() {
		delete.click();
		return new WebTablePage(driver);
	}
}
