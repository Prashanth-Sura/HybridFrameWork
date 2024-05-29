package testCases;

import PageObjects.HomePage;
import PageObjects.RegistrationPageUsingFile;
import testBase.BaseClassResourceBundle;

public class TC_0001_RegistrationUseFile extends BaseClassResourceBundle{
	
	public void CreateAccount() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		RegistrationPageUsingFile rpuf=new RegistrationPageUsingFile(driver);

		hp.click_registration();
		Thread.sleep(3000);
		rpuf.set_Firstname(RB.getString("firstname"));
		rpuf.set_lastname(RB.getString("lastname"));
		rpuf.set_address(RB.getString("address"));
		rpuf.set_city(RB.getString("city"));
		rpuf.set_state(RB.getString("state"));
		rpuf.set_zipcode(RB.getString("zipcode"));
		rpuf.set_phone(RB.getString("phone"));
		rpuf.set_ssn(RB.getString("ssn"));
		rpuf.set_username(RB.getString("username"));
		rpuf.set_password(RB.getString("password"));
		rpuf.set_cnfpassword(RB.getString("confirmpassword"));
		rpuf.click_regstration();
	}
}

		
		
		

