package video40;

/*
    After adding dependencies in your pom.xml, Eclipse sometimes needs to update its Maven configuration.
	Right-click on your project in the Project Explorer.
	Select Maven > Update Project.
	In the dialog box, ensure your project is selected, then click OK.
	This will force Maven to download any new dependencies and update the Eclipse build path.
 */

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws IOException {
		
		//Read the file
		FileInputStream file = new FileInputStream("C:\\Users\\PMLS\\eclipse-workspace\\SeleniumCourse\\src\\test\\java\\video40\\MyFile.xlsx");
		
		//Open Workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//Open Sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//Get Number of rows
		int rows = sheet.getLastRowNum();
		
		//Get number of columns
		int cells = sheet.getRow(0).getLastCellNum();
		
		//Access data of each row and the cell
		for(int i=0;i<=rows;i++) {
			
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cells;j++) {
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.toString() + "\t");
			}
			System.err.println();
		}
		
		workbook.close();
		file.close();
		
	}

}
