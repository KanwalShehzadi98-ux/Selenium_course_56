package video47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectClass {

	//This page object class is without PageFactory
	
	//1. Constructor
	WebDriver driver;
	PageObjectClass(WebDriver driver){
		this.driver = driver;
	}
	
	//2. Locators
	By userName = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By button = By.xpath("//button[normalize-space()='Login']");
	
	//3. Methods
	public void sendUsername(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	
	public void sendPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickButton() {
		driver.findElement(button).click();
	}
}
