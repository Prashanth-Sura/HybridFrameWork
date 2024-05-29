package testCases;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_Registration extends BaseClass{
	
	@Test
	public void CreateAccount() throws InterruptedException{
		
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);

		hp.click_registration();
		Thread.sleep(3000);		
		rp.set_Firstname();
		rp.set_lastname();
		rp.set_address();
		rp.set_city();
		rp.set_state();
		rp.set_zipcode();
		rp.set_phone();
		rp.set_ssn();
		rp.set_username();
		rp.set_password();
		rp.set_cnfpassword();
		rp.click_regstration();
	}
}

 
