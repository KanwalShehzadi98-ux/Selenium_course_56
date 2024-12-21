package video22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
//		//total number of links and print them
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		for(WebElement link : links) {
//			System.out.println(link.getText());
//		}
//		
//		//total number of images
//		List<WebElement> images = driver.findElements(By.tagName("img"));
//		System.out.println(images.size());
		
		//click on any product using linkText/partialLinkText
		driver.findElement(By.linkText("Sign up")).click();
	}
}
