package video29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. Select single checkbox
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//2. Select multiple checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		//Enhanced For Loop
//		for(WebElement checkbox:checkboxes) {
//			checkbox.click();
//		}
		
		//select last 3 check boxes only
//		for(int i=3;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		//select first 3 check boxes
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		//Un select selected check boxes 
		for(int i=0;i<checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		
		
	}
}
