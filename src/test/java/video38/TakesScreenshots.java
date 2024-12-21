package video38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshots {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//1. Full Page Screenshot
		TakesScreenshot ss = (TakesScreenshot) driver;
		File sourceFile = ss.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\FullPage.png");
		sourceFile.renameTo(targetFile);
	
		//2. Particular Section of the page screenshot
		WebElement path = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile1 = path.getScreenshotAs(OutputType.FILE);
		//File targetFile1 = new File(System.getProperty("user.dir")+"\\Screenshots\\SectionScreenshot.png");
		File targetFile1 = new File("C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\Screenshots\\s2.png");
		sourceFile1.renameTo(targetFile1);
		
		//3. Capture WebElement
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile2 = logo.getScreenshotAs(OutputType.FILE);
		File targetFile2 = new File("C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\Screenshots\\s3.png");
		sourceFile2.renameTo(targetFile2);

	}
}
