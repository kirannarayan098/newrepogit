package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileRead {
	
	public static void main(String[] args) throws Throwable {
		
		//Step 1: Open the document in Java Readable format
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//Step 2: create a work book
		Workbook wb = WorkbookFactory.create(fis); // excel sheet
		
		//Step 3: navigate to the required sheet
		Sheet sh = wb.getSheet("Sample");
		
		//Step 4: navigate to the required row
		Row rw = sh.getRow(2);
		
		//Step 5: navigate to the required cell
		Cell ce = rw.getCell(2);
		
		//Step 6: capture the Data inside the cell
		String data = ce.getStringCellValue();
		System.out.println(data);
		
		
	}

}
