package video32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		
		//1. 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		
		WebElement dropdown_from = driver.findElement(By.xpath("//select[@name='fromPort']"));
		dropdown_from.click();
		Select option = new Select(dropdown_from);
		option.selectByIndex(5);
		
		WebElement dropdown_to = driver.findElement(By.xpath("//select[@name='toPort']"));
		dropdown_to.click();
		Select options = new Select(dropdown_to);
		List<WebElement> myOptions = options.getOptions();
		for(int i=0;i<myOptions.size();i++) {
			String text = myOptions.get(i).getText();
			if(text.equals("New York")) {
				myOptions.get(i).click();
			}
		}
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//2. 
		int rows = driver.findElements(By.xpath("//table//tr")).size();
		System.out.println(rows);
		
		//3. 
		List<Double> prices = new ArrayList<>();
		for(int i=1;i<rows;i++) {
			String price = driver.findElement(By.xpath("//table//tr[" +i+ "]//td[6]")).getText();
			price = price.replace("$", "");
			double myPrice = Double.parseDouble(price);
			prices.add(myPrice);
		}
		Collections.sort(prices);
		double minimum = Collections.min(prices);
		for(int i=1;i<rows;i++) {
			String price = driver.findElement(By.xpath("//table//tr[" +i+ "]//td[6]")).getText();
			price = price.replace("$","");
			double myPrice = Double.parseDouble(price);
			if(myPrice == minimum) {
				driver.findElement(By.xpath("//table//tr[" +i+ "]//td[1]//input[@value='Choose This Flight']")).click();
				break;
			}
		}
		
		//4. 
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Kanwal");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("House 512 street 13");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Karachi");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Karachi");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("339393");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='cardType']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Diner's Club");
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("7393746372243");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("3894849823940");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	}
}
