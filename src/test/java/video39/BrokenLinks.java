package video39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number if links: "+links.size());
		
		int NoOfBrokenLinks = 0;
		for(WebElement linkElement : links) {
			String linkHref = linkElement.getAttribute("href");
			if(linkHref == null || linkHref.isEmpty()) {
				System.out.println("HREF attribute is null or empty. So not possible to click");
				NoOfBrokenLinks += 1;
				continue;
			}
			try {
				URL url = new URL(linkHref);
				HttpURLConnection myConnection = (HttpURLConnection) url.openConnection();
				myConnection.connect();
				if(myConnection.getResponseCode() >= 40) {
					System.out.println(linkHref+ " ======> Broken Link");
					NoOfBrokenLinks += 1;
				}
				else {
					System.out.println(linkHref+ " ======> Not a Broken Link");
				}
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Total number of broken links:"+NoOfBrokenLinks);
	}

}
