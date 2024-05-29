package PageObjectModelConstructor;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestConstructors extends LoginPageConstructors {
	
	
	public LoginTestConstructors(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@Test
	void login() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoginPageConstructors lp=new LoginPageConstructors(driver);
		lp.set_Username();
		lp.set_password();
		lp.click_login();
	}
}

	

	

