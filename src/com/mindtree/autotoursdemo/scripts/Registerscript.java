package com.mindtree.autotoursdemo.scripts;

import org.testng.annotations.Test;

import com.mindtree.autodemotours.generic.BaseTest;
import com.mindtree.autodemotours.generic.Excel;
import com.mindtree.autodemotours.generic.Utility;
import com.mindtree.autodemotours.page.NewToursHomePage;
import com.mindtree.autodemotours.page.RegisterPage;

public class Registerscript extends BaseTest{
	
	@Test(priority=1)
	public void register() {
		
		String firstName = Excel.getCellValue("RegisterPage", 1, 0, INPUT_PATH);
		String LastName = Excel.getCellValue("RegisterPage", 1, 1, INPUT_PATH);
		String phone = Excel.getCellValue("RegisterPage", 1, 2, INPUT_PATH);
		String email = Excel.getCellValue("RegisterPage", 1, 3, INPUT_PATH);
		String country = Excel.getCellValue("RegisterPage", 1, 4, INPUT_PATH);
		String userName = Excel.getCellValue("RegisterPage", 1, 5,INPUT_PATH);
		String password = Excel.getCellValue("RegisterPage", 1, 6, INPUT_PATH);
		String confirmPassword = Excel.getCellValue("RegisterPage", 1, 6, INPUT_PATH);
		
		NewToursHomePage nt = new NewToursHomePage(driver);
		nt.clickRegister();
		Utility.sleep(3);
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfName(firstName);
		rp.setlName(LastName);
		rp.setpPhone(phone);
		rp.setEmail(email);
		rp.setCountryName(country);
		rp.setUserName(userName);
		rp.setPassword(password);
        rp.setConfirmPassword(confirmPassword);
        rp.clickSubmit();
		
	}

}
