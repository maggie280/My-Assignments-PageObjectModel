package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_CreateAccount extends BaseClass {
	
	
	@BeforeTest
	public void setValues() {
		
		filename="TC_002_CreateAccount";

	}

	@Test(dataProvider = "fetchdata")
	public void createAccount(String username,String password , String accountname , String description, String noofemp ,String sitename) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clikCrmsfa()
		.clickAccountsLink()
		.clickCreateAccount()
		.enterAccountName(accountname)
		.enterDescription(description)
		.enterNoOfEmployees(noofemp)
		.enterSiteName(sitename)
		.clickBtn()
		.verifyAccount();
		
		
		
		
		
		
		
	
       

        
	}
	
}
