package video22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//System.out.println(driver.findElement(By.id("logo")).isDisplayed());
		
		//linkText
		//driver.findElement(By.linkText("Desktops")).click();
		
		//partialLinkText
		//driver.findElement(By.partialLinkText("Wish")).click();
		
		//className
		List<WebElement> listElements = driver.findElements(By.className("list-inline-item"));
		System.out.println(listElements.size());
		
		//tagName
		List<WebElement> anchorTags = driver.findElements(By.tagName("a"));
		System.out.println(anchorTags.size());
		
		//count images on the web page 
		List<WebElement> imgTags = driver.findElements(By.tagName("img"));
		System.out.println(imgTags.size());
		
		
	}
}
