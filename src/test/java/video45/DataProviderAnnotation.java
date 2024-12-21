package video45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(10000);
		boolean status = driver.findElement(By.xpath("//div[@id='content']//h2[text()='My Orders']")).isDisplayed();
		if(status == true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Login']")).click();
			Assert.fail();
		}
	}	
		
	@AfterClass
	void downtear() {
		driver.quit();
	}
	
	@DataProvider(name="dp")
	Object[][] loginData(){
		Object data[][] = {
				{"kanwalshehz123@gmail.com","123"},
				{"kanwalshehz345@gmail.com","345"},
				{"kanwalshehz678@gmail.com","567"},
				{"kanwalfayyaz9854@gmail.com","kanwal123"},
				{"kanwalshehz111@gmail.com","8919"}
		};
		
		return data;
	}
}
