package video39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		//1. Simple Shadow Element
		SearchContext selectorRoot1 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(10000);
		String text1 = selectorRoot1.findElement(By.cssSelector("#shadow-element")).getText();
		System.out.println(text1);
		
		//2. Nested Shadow Element
		SearchContext selectorRoot2 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(10000);
		
		SearchContext selectorRoot3 = selectorRoot2.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(10000);
		
		String text2 = selectorRoot3.findElement(By.cssSelector("#nested-shadow-element")).getText();
		System.out.println(text2);
		
		//3. Multiple Nested Shadow Element
		SearchContext selectRoot4 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(10000);
		
		SearchContext selectRoot5 = selectRoot4.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(10000);
		
		SearchContext selectRoot6 = selectRoot5.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(10000);
		
		String test3 = selectRoot6.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
		System.out.println(test3);
	}
}
