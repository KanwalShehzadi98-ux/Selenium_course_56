package video35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");

		WebElement desktop = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle show']"));
        WebElement mac = driver.findElement(By.xpath("//a[@class='nav-link']"));
        
        Actions act = new Actions(driver);
        //act.moveToElement(desktop).moveToElement(mac).click().build().perform();
        act.moveToElement(desktop).moveToElement(mac).click().perform();
	}

}
