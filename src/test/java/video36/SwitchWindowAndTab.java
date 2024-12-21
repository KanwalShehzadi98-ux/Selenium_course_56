package video36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowAndTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//New TAB
		driver.get("https://www.opencart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://orangehrm.com/");
		
		//New WINDOW
		driver.get("https://www.opencart.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://orangehrm.com/");
		
	}

}
