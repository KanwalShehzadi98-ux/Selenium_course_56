package video29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		//For RadioButtons and check boxes
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.id("name")).sendKeys("Kanwal Shehzadi");
//		driver.findElement(By.xpath("//input[@placeholder='Enter EMail']")).sendKeys("kanwalshehz64@gmail.com");
//		driver.findElement(By.xpath("//input[@type='text' and @id='phone']")).sendKeys("03034556754");
//		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Engr Kanwal Shehzadi (Automation Engineer)");
//		driver.findElement(By.xpath("//input[@id='female']")).click();
//		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
//		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		//For Alerts
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		driver.switchTo().alert().accept();
	}

}
