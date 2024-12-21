package video33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//1. Login to the page
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//2. Click Customers
		driver.findElement(By.xpath("//a[text()=' Customers']")).click();
		
		//3. Click >> Customers
		driver.findElement(By.xpath("//ul[@id='collapse-5']//li//a[text()='Customers']")).click();
		
		//4. Count the total number of the pages
		String text = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		System.out.println(text);
		String pages = text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1);
		int myPages = Integer.parseInt(pages);
		
		for(int i=1;i<=myPages;i++) {
			int rows = driver.findElements(By.xpath("//form[@id='form-customer']//tr")).size();
			System.out.println(rows);
			for(int j=1;j<rows;j++){
				String customerName = driver.findElement(By.xpath("//table//tbody//tr["+j+"]//td[1]")).getText();
				String email = driver.findElement(By.xpath("//table//tbody//tr["+j+"]//td[2]")).getText();	
				System.out.println(j+"\t"+customerName+"\t"+email);
			}
			driver.findElement(By.xpath("//ul//li["+i+"]")).click();
		}
	}

}
