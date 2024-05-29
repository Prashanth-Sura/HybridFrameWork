package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (id="customer.firstName")
	WebElement txt_fname;
	
	@FindBy (id="customer.lastName")
	WebElement txt_lname;
	
	@FindBy (id="customer.address.street")
	WebElement txt_address;
	
	@FindBy (id="customer.address.city")
	WebElement txt_city;
	
	@FindBy (id="customer.address.state")
	WebElement txt_state;
	
	@FindBy (id="customer.address.zipCode")
	WebElement txt_zip;
	
	@FindBy (id="customer.phoneNumber")
	WebElement txt_phone;
	
	@FindBy (id="customer.ssn")
	WebElement txt_ssn;
	
	@FindBy (id="customer.username")
	WebElement txt_username;
	
	@FindBy (id="customer.password")
	WebElement txt_password;
	
	@FindBy (id="repeatedPassword")
	WebElement txt_cnfpwd;
	
	@FindBy (xpath="//input[@value='Register']")
	WebElement btn_registration;
	
	
	
	public void set_Firstname() {
		txt_fname.sendKeys("Prashanth");
	}
	
	public void set_lastname() {
		txt_lname.sendKeys("Dev");
	}
	
	public void set_address() {
		txt_address.sendKeys("Mythrivanam");
	}
	
	public void set_city() {
		txt_city.sendKeys("Hyderabad");
	}
	public void set_state( ) {
		txt_state.sendKeys("Telangana");
	}
	
	public void set_zipcode( ) {
		txt_zip.sendKeys("5000032");
	}
	
	public void set_phone( ) {
		txt_phone.sendKeys("9876543210");
	}
	
	public void set_ssn( ) {
		txt_ssn.sendKeys("Abcdef");
	}
	
	public void set_username( ) {
		txt_username.sendKeys("Ramu@123");
	}
	
	public void set_password( ) {
		txt_password.sendKeys("Ramesh@123");
	}
	
	public void set_cnfpassword() {
		txt_cnfpwd.sendKeys("Ramesh@123");
	}
	
	public void click_regstration() {
		btn_registration.click();
	}
}

