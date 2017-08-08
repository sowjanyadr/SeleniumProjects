package com.mindtree.autodemotours.generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAUTOCONST{
	
	public WebDriver driver;
	public String strURL;
	public long lngITO;
	public Logger log = Logger.getLogger(this.getClass());
	
	
	@BeforeSuite
	public void initFrameWork(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);		
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openApplication(@Optional("chrome") String browser){
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
			log.info("Opening the chromeDriver");
		}
		else {
			driver = new FirefoxDriver();
			log.info("Opening the FireFoxDriver");
		}
		strURL = Utility.getProperties("URL", CONFIG_PROPERTIES);
		log.info("Open the URL");
		driver.get(strURL);
		String strITO = Utility.getProperties("ITO", CONFIG_PROPERTIES);
		lngITO = Long.parseLong(strITO);
		driver.manage().timeouts().implicitlyWait(lngITO, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closeApp(){
		log.info("closing the application");
		driver.close();
	}

}
