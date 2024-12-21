package video39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSVG {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Absolute xpath cannot be used
		//Use name attribute in relative xpath
		//Click the text beside the svg in order to click JUGAR
		
		//driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M 499.997 ')]")).click();
		//name() and @name are different inn automation name() means the tagename 
		// and @name means the attribute
		
		//driver.findElement(By.xpath("//*[@d='M422,332H90c-49.626,0-90,40.374-90,90v90h512v-90C512,372.374,471.626,332,422,332z M274.289,392h-36.577l-7.5-30h51.578   L274.289,392z M210.691,407.611L198.293,482H136V362h63.289L210.691,407.611z M238.707,422h34.586l10,60h-54.586L238.707,422z    M301.309,407.611L312.711,362H376v120h-62.293L301.309,407.611z M30,422c0-33.084,26.916-60,60-60h16v120H30V422z M482,482h-76   V362h16c33.084,0,60,26.916,60,60V482z' and name()='path']")).click();
		//driver.findElement(By.xpath("//*[@d='M422,332H90c-49.626,0-90,40.374-90,90v90h512v-90C512,372.374,471.626,332,422,332z M274.289,392h-36.577l-7.5-30h51.578   L274.289,392z M210.691,407.611L198.293,482H136V362h63.289L210.691,407.611z M238.707,422h34.586l10,60h-54.586L238.707,422z    M301.309,407.611L312.711,362H376v120h-62.293L301.309,407.611z M30,422c0-33.084,26.916-60,60-60h16v120H30V422z M482,482h-76   V362h16c33.084,0,60,26.916,60,60V482z']")).click();		
	}

}
