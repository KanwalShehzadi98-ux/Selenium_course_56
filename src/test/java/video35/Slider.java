package video35;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		//Move forward using min slider
		WebElement min_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		System.out.println(min_slider.getLocation());
		act.dragAndDropBy(min_slider,100,0).perform();
		System.out.println(min_slider.getLocation());
	
		//Move backward using max slider
		WebElement max_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][last()]"));
		System.out.println(max_slider.getLocation());
		act.dragAndDropBy(max_slider,-100,0).perform();
		System.out.println(max_slider.getLocation());
	}

}
