package com.mindtree.autodemotours.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BasePage implements IAUTOCONST{
	
	public WebDriver driver;
	public WebDriverWait wait;
	public long lngETO;
	public long lngITO;
	public Logger log;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		String sETO = Utility.getProperties("ETO", CONFIG_PROPERTIES);
		lngETO = Long.parseLong(sETO);
		this.wait = new WebDriverWait(driver,lngETO);
		this.log = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitle(String eTitle){
		try{
			log.info("verifying the title");
			wait.until(ExpectedConditions.titleIs(eTitle));	
			
		}
		catch(Exception e){
			String title = driver.getTitle();
			log.debug("Actual Title is" + title);
			log.debug("The title does bot match");
			Assert.fail();
			
		}
		
	}
	
	public void verifyWebElement(WebElement element){
		try{
			log.info("WebElement is present");
		wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e){
			log.debug("element is not present");
		}
	}

}
