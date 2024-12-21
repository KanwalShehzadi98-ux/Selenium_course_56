package video39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		SearchContext shadowRoot1 = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(10000);
		
		SearchContext shadowRoot2 = shadowRoot1.findElement(By.cssSelector("app-header[effects='waterfall']")).getShadowRoot();
		Thread.sleep(10000);
		
		SearchContext shadowRoot3 = shadowRoot2.findElement(By.cssSelector(".toolbar-bottom")).getShadowRoot();
		Thread.sleep(10000);
		
		SearchContext shadowRoot4 = shadowRoot3.findElement(By.cssSelector("book-input-decorator")).getShadowRoot();
		Thread.sleep(10000);
		
		shadowRoot4.findElement(By.cssSelector("#input")).sendKeys("Eat, Pray, Love");
	}

}
