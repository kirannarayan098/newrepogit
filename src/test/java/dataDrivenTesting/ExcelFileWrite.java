package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWrite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Step 1: Open the document in Java Readable format
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");

		// Step 2: create a work book
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3: navigate to sheet
		Sheet sh = wb.createSheet("Trial");
		
		//Step 4: navigate to row
		Row rw = sh.createRow(3);
		
		//Step 5: navigate to cell
		Cell cl = rw.createCell(2);
		
		//Step 6: set the data to be written
		cl.setCellValue("Qspiders");
		
		//Step 7: open the document in java write format
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		wb.write(fos);
		System.out.println("data added");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
