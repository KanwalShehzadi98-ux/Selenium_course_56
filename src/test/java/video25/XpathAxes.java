package video25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		
		//1. Parent
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://books.toscrape.com/");
		//System.out.println(driver.findElement(By.xpath("//form[@method='get']/parent::div")).getText());
		
		//Just to give you index idea lady
		//driver.findElement(By.xpath("(//form//button[text()='Add to basket'])[1]")).click();
		
		//2. Child
		//System.out.println(driver.findElement(By.xpath("//h3/child::a")).getText());
		
		//3. Ancestor
		//System.out.println(driver.findElement(By.xpath("//strong[text()='Warning!']/ancestor::section")).isDisplayed());
		
		//4. Descendant
		//driver.findElement(By.xpath("(//li/descendant::a)[20]")).click();
		
		//5. Following
		//driver.findElement(By.xpath("(//li/following::img)[last()]")).click();
		
		//6. Preceding
		//driver.findElement(By.xpath("(//li/preceding::img)[1]")).click();
		
		//7. Following-sibling
		//System.out.println(driver.findElement(By.xpath("//a[text()='Books to Scrape']/following-sibling::small")).isDisplayed());
		
		//8. Preceding-sibling
		//System.out.println(driver.findElement(By.xpath("//small[text()=' We love being scraped!']/preceding-sibling::a")).getText());
		 
	}
}
