package video31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestedDropdowns {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://google.com/"); 
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		List<WebElement> lists = driver.findElements(By.xpath("//li//div[@class='wM6W7d' and @role='presentation']//span"));
		System.out.println(lists.size());
	}

}
