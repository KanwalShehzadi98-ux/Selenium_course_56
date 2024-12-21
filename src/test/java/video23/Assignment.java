package video23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		//tag class
		driver.findElement(By.cssSelector("input.search-box-text.ui-autocomplete-input")).sendKeys("iPhone15");
		
		//tag attribute
		driver.findElement(By.cssSelector("li#topcartlink")).click();

		
	}

}
