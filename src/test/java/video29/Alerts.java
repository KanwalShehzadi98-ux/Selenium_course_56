package video29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1. Normal Alert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();
		
		//2. Confirmation Alert 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.dismiss();
		
		//3. Prompt Alert 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert1 = driver.switchTo().alert();
		myalert1.sendKeys("Welcome");
		myalert.accept();
	}
}
