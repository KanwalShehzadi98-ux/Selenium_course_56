package video21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test case
 * ---------------------------------
 * 1. Launch browser
 * 2. open URL https://demo.opencart.com/
 * 3. validate title should be "Your Store"
 * 4. close browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		System.out.println("testing....");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
	}
}
