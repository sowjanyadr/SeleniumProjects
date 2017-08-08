package com.mindtree.autodemotours.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.autodemotours.generic.BasePage;
import com.mindtree.autodemotours.generic.Utility;

public class RegisterPage extends BasePage{
	
	@FindBy (name="firstName")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="phone")
	private WebElement pPhone;
	
	@FindBy(name="userName")
	private WebElement email;
	
	@FindBy(name="country")
	private WebElement countryName;
	
	@FindBy(name = "email")
	private WebElement userName;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(name="register")
	private WebElement submit;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setfName(String firstName){
		fName.sendKeys(firstName);
	}
	
	public void setlName(String lastName){
		lName.sendKeys(lastName);
	}
	
	public void setpPhone(String phoneNumber){
		pPhone.sendKeys(phoneNumber);
	}
	
	public void setEmail(String emaiL){
		email.sendKeys(emaiL);
	}
	
	public void setUserName(String uname){
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pwd){
		password.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String Confpwd){
		confirmPassword.sendKeys(Confpwd);
	}
	
	public void setCountryName(String country){
		countryName.click();
		Utility.sleep(2);
		Select select = new Select(countryName);
		select.selectByVisibleText(country);
		
	}
	
	public void clickSubmit(){
		submit.click();
	}
	

}
