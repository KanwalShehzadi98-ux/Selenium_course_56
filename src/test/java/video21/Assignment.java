package video21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		String title = driver.getTitle();
		if(title.equals("nopCommerce demo stor")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		driver.close();
	}

}
