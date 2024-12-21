package video26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		//1. isDisplayed()
		//System.out.println(driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed());
		
		//2. isEnabled()
		//System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
		
		//2. isSelected()
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
	}

}
