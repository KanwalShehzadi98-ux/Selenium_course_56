package video26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseAgain {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://testautomationpractice.blogspot.com/"); 
		
		//1. Provide string search for it
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("kanwal");
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		
		//2. Count number of links
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
		System.out.println(links.size());
		
		//3. Click on each link using for loop
		for(int i=0;i<links.size();i++) {
			links.get(i).click();
		}
		
		//4. Get window IDs of all 
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listOfHandles = new ArrayList<>(windowHandles);
		for(int i=0;i<listOfHandles.size();i++) {
			System.out.println(listOfHandles.get(i));
		}
		
		//5. Close a few of these
		for(int i=0;i<listOfHandles.size();i++) {
			driver.switchTo().window(listOfHandles.get(i));
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Kanwal Rekhi - Wikipedia") || driver.getTitle().equals("Kanwal Ameen - Wikipedia")) {
				driver.close();
			}
		}
	}
}
