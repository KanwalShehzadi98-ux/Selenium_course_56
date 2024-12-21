package video37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//3. Slider
		//3.1 Move the slider using pixels
		js.executeScript("window.scrollBy(0,1500)", " ");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//3.2 Move the slider till the element is visible
		WebElement heading = driver.findElement(By.xpath("//h2[text()='Form']"));
		js.executeScript("arguments[0].scrollIntoView();",heading);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//3.3 Scroll till bottom
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		//3.4 Scroll to top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
