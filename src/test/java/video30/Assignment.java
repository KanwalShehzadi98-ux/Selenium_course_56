package video30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ui.vision/demo/webtest/frames/");
//		driver.manage().window().maximize();

		//This was not working perfectly so I did another method
//		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
//		driver.switchTo().frame(frame5);
//		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("This is frame 5");
//		driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();
		
		//Another Method
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/frame_5.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Frame 5");
		driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
		driver.findElement(By.xpath("//small[text()='Install the free browser extension!']")).click();
	}
}
