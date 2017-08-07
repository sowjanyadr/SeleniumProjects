package com.mindtree.autodemotours.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mindtree.autodemotours.generic.BasePage;

public class NewToursHomePage extends BasePage{
	
	@FindBy(xpath = "//a[text()='SIGN-ON']")
	private WebElement signOn;
	
	@FindBy(xpath = "//a[text()='REGISTER']")
	private WebElement register;
	
	@FindBy(xpath = "//a[text()='SUPPORT']")
	private WebElement support;
	
	public NewToursHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickSignOn(){
		signOn.click();
	}
	
	public void clickRegister(){
		register.click();
	}
	
	public void clickSupport(){
		support.click();
	}
	
	
	

}
