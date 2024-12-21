package video26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		//1. get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//2. getTitle()
		System.out.println(driver.getTitle());
		
		//3. getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		
		//4. getPageSource()
		System.out.println(driver.getPageSource());
		
		//5. getWindowHandle()
		System.out.println(driver.getWindowHandle());
		
		//6. getWindowHandles()
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		
		
	}

}
