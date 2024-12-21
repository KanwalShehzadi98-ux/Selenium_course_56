package video24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/demo");
		
		
		//1. x path with a single web element
//		List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
//		for(WebElement link : links) {
//			System.out.println(link.getText()+" "+link.isDisplayed());
//		}
		
		//2. x path with multiple web elements 
		//driver.findElement(By.xpath("//*[@width='38'][@height='38']")).click();
		
		//3. x path with and/or 
		driver.findElement(By.className("stats-img")).click();
		//driver.findElement(By.xpath("//*[@alt='Volvo Cars Collection' and @title='Volvo Cars Collection']")).click();
		//driver.findElement(By.xpath("//*[@alt='Volvo Cars Collection' or @title='Volvo Cars Collection']")).click();

		//4. x path with text()
		//boolean collection = driver.findElement(By.xpath("//*[text()='Volvo Cars Collection']")).isDisplayed();
		//System.out.println(collection);
		
		driver.findElement(By.xpath("//img[@alt='Volvo Cars Collection']")).click();
		
		//5. x path with contains()
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'I accept')]")).isDisplayed());
		
//		//6. x path with start-with()
		
		//for(int i=0;i<10000;i++) {
		//	for(int j=0;j<10000;j++) {
		//		System.out.println();
		//	}
		//}
		//boolean collection2 = driver.findElement(By.xpath("//*[starts-with(@title,'read')]")).isDisplayed();
		//System.out.println(collection2);
//		
//		//7. chained x path
//		boolean collection3 = driver.findElement(By.xpath("//*[starts-with(@method,'post')]/input")).isDisplayed();
//		System.out.println(collection3);
	}
}
