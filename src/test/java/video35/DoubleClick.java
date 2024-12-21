package video35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("WELCOME");
		Actions act = new Actions(driver);
		WebElement myButton = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(myButton).perform();
		String field2 = driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
		
		if(field1.getAttribute("value").equals(field2)) {
			System.out.println("Matched...");
		}
		else {
			System.out.println("Not matched...");
		}
	}

}
