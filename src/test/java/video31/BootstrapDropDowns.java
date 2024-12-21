package video31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
		
		//1. Click one element
		//driver.findElement(By.xpath("//input[@type='checkbox' and @value='Angular']")).click();
		
		//2. Click multiple elements
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		System.out.println(checkboxes.size());
//		for(WebElement checkbox:checkboxes) {
//			checkbox.click();
//		}
		
		//3. Write names of all the checkboxes
//		for(int i=0;i<checkboxes.size();i++) {
//			System.out.println(checkboxes.get(i).getText());
//		}
		
		//4. Check multiple elements
		for(WebElement checkbox:checkboxes) {
			if(checkbox.getText().equals("Java") || checkbox.getText().equals("Python") || checkbox.getText().equals("C#")) {
				checkbox.click();
			}
		}
	}
}
