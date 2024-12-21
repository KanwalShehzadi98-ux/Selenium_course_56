package video26;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.get("https://demo.nopcommerce.com/");
		
		//1. navigate().to()
		//with String
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.navigate().to("https://demo.nopcommerce.com/");
		
		//with URL object
		URL myUrl = new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myUrl);
		
		URL myUrl1 = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(myUrl1);
		
		//2. navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		//3. navigate().back()
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//4. navigate().refresh()
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
	}

}
