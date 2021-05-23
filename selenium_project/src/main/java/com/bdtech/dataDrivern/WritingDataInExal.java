package com.bdtech.dataDrivern;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInExal {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C:\\Users\\md islam\\Documents\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("bdtech");// any name
		// creating row
		for (int i = 0; i <= 5; i++) {
			XSSFRow row = sheet.createRow(i);
			// now create column
			for (int j = 0; j <= 5; j++) {
				row.createCell(j).setCellValue("abc");
			}

		}

		workbook.write(file);
		file.close();
		System.out.println("writing data is done");

	}

}
