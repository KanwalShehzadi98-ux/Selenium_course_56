package video37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles{
	
	public static void Main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//      Single File Upload
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\PMLS\\Downloads\\Semester 6\\NA LAB\\LAB 01 Final.docx");
//		String validate = driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
//		if(validate.equals("LAB 01 Final.docx")) {
//			System.out.println("Uploaded Successfully");
//		}
//		else {
//			System.out.println("Upload Failed");
//		}
		
		//Multiple File Upload
		String file1 = "C:\\Users\\PMLS\\Downloads\\Semester 6\\NA LAB\\LAB 01 Final.docx";
		String file2 = "C:\\Users\\PMLS\\Downloads\\Semester 6\\NA LAB\\LAB 02 Final.docx";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int mySize = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		String myFile1 = driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText();
		String myFile2 = driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText();

		if(mySize == 2) {
			System.out.println("Yes 2!");
		}else {
			System.out.println("No Something is wrong over there");
		}
		
		if(myFile1.equals("LAB 01 Final.docx") && myFile2.equals("LAB 02 Final.docx")) {
			System.out.println("Files uploaded succesfully");
		}
		else {
			System.out.println("Upload Failed");
		}	
	}
}