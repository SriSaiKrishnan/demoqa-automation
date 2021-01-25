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

public class UploadandDownloadPage extends BasePage {
	

	@FindBy(xpath = "//h5[text() = 'Elements']")
	private WebElement element;
	
	@FindBy(xpath = "//span[text()='Upload and Download']")
	private WebElement uploaddownload;
	
	@FindBy(id = "downloadButton")
	private WebElement download;
	
	@FindBy(id = "uploadFile")
	private WebElement upload;
	
	public UploadandDownloadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	@Step
	public UploadandDownloadPage clickOnElements() {
		wait(element);
		element.click();
		return new UploadandDownloadPage(driver);
	}
	
	@Step
	public UploadandDownloadPage clickOnUploadDownload() {
		wait(uploaddownload);
		scroll();
		uploaddownload.click();
		return new UploadandDownloadPage(driver);
	}
	
	@Step
	public UploadandDownloadPage clickOnDownload() {
		wait(download);
		download.click();
		return new UploadandDownloadPage(driver);
	}
	
	@Step
	public UploadandDownloadPage clickOnUpload() {
		wait(upload);
		upload.sendKeys("/Users/sv/Downloads/sampleFile (1).jpeg");
		return new UploadandDownloadPage(driver);
	}
	
	public UploadandDownloadPage scroll() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,500)");
		return new UploadandDownloadPage(driver);
	}

}
