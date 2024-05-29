package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClassResourceBundle {
	
	
	public WebDriver driver;
	public ResourceBundle RB;
	@BeforeClass

	public void setup() {
		
		RB= ResourceBundle.getBundle("config");
		
		driver=new ChromeDriver();
		driver.get(RB.getString("baseURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void close() {
		driver.quit();
	}
}

		
	


