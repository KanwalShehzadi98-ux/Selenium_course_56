package video36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement regLink = driver.findElement(By.xpath("//a[text()='Register']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		List<String> windowIds = new ArrayList<>(driver.getWindowHandles());
		String id = windowIds.get(1);
		driver.switchTo().window(id);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Engr. Kanwal Shehzadi");
		
		driver.switchTo().window(windowIds.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-Shirts");
	}

}
