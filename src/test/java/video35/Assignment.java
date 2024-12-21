package video35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		
		//DOUBLE CLICK & GRAG AND DROP ASSIGNMENT
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("Engr. Kanwal Shehzadi");
		String field1Value = field1.getAttribute("value");
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		field2.sendKeys(field1Value);
		driver.findElement(By.xpath("//button[text()='Copy Text']")).click();
		
		if(field1Value.equals(field2.getAttribute("value"))) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		
		//-----------------------------------------------------------------------------
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
}
