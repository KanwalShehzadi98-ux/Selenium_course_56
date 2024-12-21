package video47;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCaseClass {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void login() {
		PageObjectClass obj = new PageObjectClass(driver);
		obj.sendUsername("Admin");
		obj.sendPassword("admin123");
		obj.clickButton();
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
	
	//you need to run the test case class for output
	
}
