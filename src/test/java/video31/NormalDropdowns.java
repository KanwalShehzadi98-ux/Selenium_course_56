package video31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NormalDropdowns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement option = driver.findElement(By.xpath("//select[@id='country']"));
		Select myElement = new Select(option);
//		myElement.selectByVisibleText("China");
//		myElement.selectByValue("china");
//		myElement.selectByIndex(7);
		
		List<WebElement> myOptions = myElement.getOptions();
//		for(int i=0;i<myOptions.size();i++) {
//			System.out.println(myOptions.get(i).getText());
//		}
//		
//		for(WebElement myOption:myOptions) {
//			System.out.println(myOption.getText());
//		}
		
		//Select Multiple Options
		for(WebElement myOption:myOptions) {
			if((myOption.getText().equals("Germany")) || (myOption.getText().equals("France")) || (myOption.getText().equals("Australia")))
			{
				myOption.click();
			}
		}
	}
}
