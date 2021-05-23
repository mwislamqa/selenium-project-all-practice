package com.bdtech.dataDrivern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritinDataInExcelMultipleSheet {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\md islam\\Documents\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("bdtech1");// any name
		XSSFSheet sheet2 = workbook.createSheet("bdtech2");
		// creating row
		for (int i = 0; i <= 5; i++) {
			XSSFRow row1 = sheet1.createRow(i);
			XSSFRow row2 = sheet2.createRow(i);
			// now create column
			for (int j = 0; j <= 5; j++) {
				row1.createCell(j).setCellValue("abc");
				row2.createCell(j).setCellValue("xyz");
			}

		}

		workbook.write(file);
		file.close();
		System.out.println("writing data is done");

		
	}

}
