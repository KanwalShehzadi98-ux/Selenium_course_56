package video38;

import java.io.File;

/*
 * Download CRX Extractor extension in Chrome
 * Download CRX File by right-click the extension in the chrome store
 * 
 */

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionsInAutomatedWindow {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
//		File file = new File("C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video38\\Check-My-Links-Chrome-Web-Store.crx");
//		options.addExtensions(file);
		
		File file1 = new File("C:\\Users\\\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video38\\SBlock-Super-Ad-Blocker-Chrome-Web-Store.crx");
		options.addExtensions(file1);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
}
