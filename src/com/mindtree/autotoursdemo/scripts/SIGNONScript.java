package com.mindtree.autotoursdemo.scripts;



import org.testng.annotations.Test;

import com.mindtree.autodemotours.generic.BaseTest;
import com.mindtree.autodemotours.generic.Excel;
import com.mindtree.autodemotours.generic.Utility;
import com.mindtree.autodemotours.page.NewToursHomePage;
import com.mindtree.autodemotours.page.SIGNONPage;

public class SIGNONScript extends BaseTest{
	
	@Test(priority=2)
	public void signOn(){
		
	//Step 1: Click on SignOnButton
	NewToursHomePage nt = new NewToursHomePage(driver);
	nt.clickSignOn();
    Utility.sleep(3);
	SIGNONPage sp = new SIGNONPage(driver);
	String userName = Excel.getCellValue("SignOn", 1,0, INPUT_PATH);
	String password = Excel.getCellValue("SignOn", 1, 1, INPUT_PATH);
	sp.setUserName(userName);
	Utility.sleep(2);
	sp.setPassword(password);
	sp.clickLogin();
	
	
}
}
