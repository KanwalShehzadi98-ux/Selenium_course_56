package video471;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {

	//Page Object Class with PageFactory
	
	//1. Constructor
	WebDriver driver;
	PageObjectClass(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//2. Locators
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement button; 
	
	//OR
	//@FindBy(how=How.XPATH, using="//input[@placeholder='Username']") WebElement txt_name;
	
	//3. Methods
	public void setUsername(String user) {
		username.sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void buttonClick() {
		button.click();
	}
}
