package video26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Exercise
//Close window no 1 3 5 from 1 2 3 4 5 

public class Exercise {

	public static void main(String[] args) throws InterruptedException {
		
		//when you have only 2 browser windows
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Open the first URL in the current tab
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Use JavaScript to open a new tab and navigate to the second URL
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('https://getbootstrap.com/docs/5.0/getting-started/introduction/','_blank');");

		// Now fetch all the window handles
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds);

		// Iterate through all the window handles and print their titles
		for (String windowId : windowIds) {
		    driver.switchTo().window(windowId);
		    System.out.println(driver.getTitle());
		}

	}
}
