package video40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video40\\MyFile2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheet");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cells:");
		int cells = sc.nextInt();
		
		for(int i=0;i<rows;i++) {
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<cells;j++) {
				XSSFCell cell = row.createCell(j);
				System.out.println("Enter the value at:"+i+""+j);
				cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
	}
}
