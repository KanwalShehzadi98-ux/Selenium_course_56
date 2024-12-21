package video34;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static int hashFunc(String month) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("January",1);
		map.put("February",2);
		map.put("March",3);
		map.put("April",4);
		map.put("May",5);
		map.put("June",6);
		map.put("July",7);
		map.put("August",8);
		map.put("September",9);
		map.put("October",10);
		map.put("November",11);
		map.put("December",12);
		return map.get(month);
	}

	public static boolean findYearAndMonth(WebDriver driver, int selectYear, String selectMonth) {
		String y = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		int hashedMonth = hashFunc(m); //on web 
		int hashedSelectMonth = hashFunc(selectMonth); //my choice
		if(Integer.parseInt(y) == selectYear) {
			while(hashedMonth!=hashedSelectMonth) {
				if(hashedMonth < hashedSelectMonth) {
					driver.findElement(By.xpath("//span[text()='Next']")).click();
					m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				}
				else {
					driver.findElement(By.xpath("//span[text()='Prev']")).click();
					m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				}
				hashedMonth = hashFunc(m);
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(myFrame);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		int selectYear = 2027;
		String selectMonth = "March";
		
		while(true) {
			if(findYearAndMonth(driver, selectYear, selectMonth)) {
				break;
			}
			if(Integer.parseInt(year) > selectYear) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}	
		}
		
		int rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr[1]//td")).size();
		for(int i=1;i<rows;i++) {
			for(int j=1;j<cols;j++) {
				String value = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).getText();
				if(!(value.trim().isEmpty())) {
					int myValue = Integer.parseInt(value);
					if(myValue == 21) {
						driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).click();
					}
				}
			}
		}
//		driver.close();
	}
}
