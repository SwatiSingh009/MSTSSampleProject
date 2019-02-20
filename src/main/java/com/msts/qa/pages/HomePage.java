package com.msts.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msts.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[@id='block-menu-menu-main-menu-for-msts']//a[text()='Our Solutions']")
	WebElement ourSolutionsLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		System.out.println("test");
		return driver.getTitle();
	}
	
	public boolean verifyOurSolutionLinkDisplayed(){
		return ourSolutionsLink.isDisplayed();
	}
		

}
