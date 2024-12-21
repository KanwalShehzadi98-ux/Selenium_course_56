package video33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		int noOfPages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		for(int p=1;p<noOfPages;p++) {
			int noOfRows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
			int noOfCols = driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
			for(int i=1;i<noOfRows;i++) {
				for(int j=1;j<=noOfCols;j++) {
					if(j == 4) {
						driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[4]//input")).click();
						System.out.println("checked");
						break;
					}
					String text = driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+"\t");
				}
				System.out.println();
			}
		}
		
		
	}
}
