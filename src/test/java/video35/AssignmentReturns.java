package video35;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentReturns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement box1 = driver.findElement(By.xpath("//div[@id='shoppingCart1']"));
		WebElement value1 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable' and @id='fourth'][1]"));
		
		WebElement box2 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"));
		WebElement value2 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(box1, value1).perform();
		act.dragAndDrop(value2, box2).perform();
		
	}
}
