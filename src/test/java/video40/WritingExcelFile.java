package video40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video40\\MyFile1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("MySheet1");
		
		XSSFRow row0 = sheet.createRow(0);
			row0.createCell(0).setCellValue("Kanwal");
			row0.createCell(1).setCellValue("QA Automation Engineer");
			row0.createCell(2).setCellValue("Bachelor in Software Engineering");

		XSSFRow row1 = sheet.createRow(1);
			row1.createCell(0).setCellValue("Mishal");
			row1.createCell(1).setCellValue("Penetration Tester");
			row1.createCell(2).setCellValue("Bachelor in Software Engineering");
			
		XSSFRow row2 = sheet.createRow(2);
			row2.createCell(0).setCellValue("Aown");
			row2.createCell(1).setCellValue("Cardeologist");
			row2.createCell(2).setCellValue("MBBS");

	   workbook.write(file);
	   workbook.close();
	   file.close();
	}

}
