package video35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		WebElement source1 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement source3 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement target3 = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement source4 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement target4 = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement source5 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement target5 = driver.findElement(By.xpath("//div[@id='box107']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source1, target1).perform();
		act.dragAndDrop(source2, target2).perform();
		act.dragAndDrop(source3, target3).perform();
		act.dragAndDrop(source4, target4).perform();
		act.dragAndDrop(source5, target5).perform();
		
		WebElement myDiv = driver.findElement(By.xpath("//div[@id='dropContent']"));
		act.dragAndDrop(source1,myDiv).perform();
		act.dragAndDrop(source2,myDiv).perform();
		act.dragAndDrop(source3,myDiv).perform();
		act.dragAndDrop(source4,myDiv).perform();
		act.dragAndDrop(source5,myDiv).perform();
	}
}
