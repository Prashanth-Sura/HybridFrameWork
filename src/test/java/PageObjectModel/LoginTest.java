package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends LoginPage{

	@Test
	void login() {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		LoginPage lp = new LoginPage();
		
		lp.setUsername();
		lp.setPassword();
		lp.clickLogin();
		
		
	}

}	
		
		

