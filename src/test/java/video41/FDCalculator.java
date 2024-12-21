package video41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://fd-calculator.in/");
		
		String filePath = "C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video41\\MyFile.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		System.out.println(rows);
		
		for(int i=1;i<=rows;i++) {
			
			//1. Read data from excel
			String principle = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rate_of_interest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String period = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String frequency = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String maturityValue = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String expectedValue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			String result = ExcelUtils.getCellData(filePath, "Sheet1", i, 6);
			
			//2. Send to the application
			driver.findElement(By.xpath("//input[@id='amountInputField']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interestInputField']")).sendKeys(rate_of_interest);
			driver.findElement(By.xpath("//input[@id='periodInputField']")).sendKeys(period);
			Select dd2 = new Select(driver.findElement(By.xpath("//select[@id='frequencySelectField']")));
			dd2.selectByVisibleText(frequency);
			driver.findElement(By.xpath("//button[@id='calculateButton']")).click();
			
			//3. Validation
			String actualMaturityAmount = driver.findElement(By.xpath("//span[@id='futureValue']")).getText();

			int lakhIndex = actualMaturityAmount.indexOf('L');
			actualMaturityAmount = actualMaturityAmount.substring(0, lakhIndex-1).trim();
	       
			if(Double.parseDouble(actualMaturityAmount) == Double.parseDouble(maturityValue)) {
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 6, "Passed");
			}
			else {
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 6,"Failed");
			}
			driver.findElement(By.xpath("//input[@id='amountInputField']")).clear();
			driver.findElement(By.xpath("//input[@id='interestInputField']")).clear();
			driver.findElement(By.xpath("//input[@id='periodInputField']")).clear();
		}
	}
}
