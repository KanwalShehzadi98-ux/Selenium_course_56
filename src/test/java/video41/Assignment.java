package video41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
		String filePath = "C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video41\\MyFile1.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		int cells = ExcelUtils.getCellCount(filePath, "Sheet1", 0);
		
		for(int i=1;i<=rows;i++) {
			
			//get data from excel
			String initialDepositAmount = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String interestRate = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String length_in_months = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			//String compounding = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String total = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String expected = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);

			//send to the application
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
			
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(initialDepositAmount);
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(length_in_months);
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(interestRate);
			//driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper']")).click();
			//driver.findElement(By.xpath("//mat-option//span[contains(text(),'"+compounding+"')]")).click();
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")).click();
		
			//validation
			String result = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			result = result.replace(",","").substring(1);
			
			if(Double.parseDouble(result) == Double.parseDouble(total)) {
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 6, "Passed");
			}
			else {
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 6, "Failed");
			}
		}
		driver.quit();
	}
}
