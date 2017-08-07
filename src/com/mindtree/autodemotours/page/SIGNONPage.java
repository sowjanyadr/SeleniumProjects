package com.mindtree.autodemotours.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mindtree.autodemotours.generic.BasePage;

public class SIGNONPage extends BasePage{
	
	@FindBy(name = "userName")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(name="login")
	private WebElement login; 

	public SIGNONPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setUserName(String username){
		userName.sendKeys(username);	
	}
	
	public void setPassword(String password){
		passWord.sendKeys(password);
	}
	
	public void clickLogin(){
		login.click();
	}
	
	
	

}
