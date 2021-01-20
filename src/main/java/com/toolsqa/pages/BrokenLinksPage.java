package com.toolsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.toolsqa.base.BasePage;

public class BrokenLinksPage extends BasePage {
	
	public BrokenLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
