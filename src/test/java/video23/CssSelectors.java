package video23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1. tag id 
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobile phone");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("mobile phone");
		
		//2. tag class 
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("laptops");
		driver.findElement(By.cssSelector("search-box-text")).sendKeys("laptops");
		
		//3. tag attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("tablets");
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("tablets");
		
		//4. tag class attribute
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("tablets");
		driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("tablets");
	}
}
