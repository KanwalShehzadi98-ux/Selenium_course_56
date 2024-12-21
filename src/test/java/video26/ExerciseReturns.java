package video26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseReturns {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Open the first URL in the current tab
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		// Use JavascriptExecutor to open new tabs with different URLs
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('https://getbootstrap.com/docs/5.0/getting-started/introduction/', '_blank');");
		js.executeScript("window.open('https://cdnjs.com/libraries/font-awesome', '_blank');");
		js.executeScript("window.open('https://fontawesome.com/icons', '_blank');");
		js.executeScript("window.open('https://fonts.google.com/', '_blank');");

		// Get the window handles (now there should be multiple)
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList(handles);
		
		// Print each window handle (optional) and their corresponding window titles
		for(int i = 0; i < handlesList.size(); i++) {
			driver.switchTo().window(handlesList.get(i));
			System.out.println(driver.getWindowHandle()+" "+driver.getTitle());
			if(driver.getTitle().equals("OrangeHRM") || driver.getTitle().equals("Introduction · Bootstrap v5.0")) {
				driver.close();
			}
		}
	}
}
