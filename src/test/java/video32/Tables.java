package video32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		//1. Find total number of rows in a table
		int rows = driver.findElements(By.xpath("//div[@id='HTML1']//table//tr")).size();
		
		//2. Find total number of columns in a table
		int cols = driver.findElements(By.xpath("//div[@id='HTML1']//table//th")).size();
		
		//3. Read data from specific row and column (5th row and 1st column)
		WebElement specific = driver.findElement(By.xpath("//div[@id='HTML1']//table//tr[5]//td[1]"));
		System.out.println(specific.getText());
		
		//4. Print all the rows and columns data of the table 
        List<WebElement> headings = driver.findElements(By.xpath("//div[@id='HTML1']//table//tr[1]//th"));
        for(WebElement heading:headings) {
        	System.out.println(heading.getText());
        }
		
		for (int i = 2; i <= rows; i++) {
		    for (int j = 1; j <= cols; j++) {
		        // Corrected XPath
		        String cellText = driver.findElement(By.xpath("//div[@id='HTML1']//table//tr[" + i + "]//td[" + j + "]")).getText();
		        System.out.print(cellText + "\t");
		    }
		    System.out.println();
		}
		
		//5. Print book names whose author is Mukesh
		System.out.println("----------------------------------------------------------------------------------");
		for(int i=2;i<rows;i++) {
			String author = driver.findElement(By.xpath("//div[@id='HTML1']//table//tr[" +i+ "]//td[2]")).getText();
			if(author.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//td[1]")).getText();
				System.out.println(bookName);
			}
		}
		
		//6. Calculate the total price of all books 
		int count = 0;
		for(int i=2;i<rows;i++) {
			String price = driver.findElement(By.xpath("//div[@id='HTML1']//table//tr[" +i+ "]//td[4]")).getText();
			count = count + Integer.parseInt(price);
		}
		System.out.println(count);
	}
}
