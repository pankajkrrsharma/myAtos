package com.learning.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.learning.testbase.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	public static String TEST_DATA_PATH = "D:\\Work_Space\\myatosSyntel\\src\\main\\java\\com\\learning\\testdata\\MyAtosTestData.xlsx";


	static Workbook book;
	static Sheet sheet;

	public static Object [][] getTestdata(String sheetname){

		FileInputStream file = null;

		try {
			file = new FileInputStream(TEST_DATA_PATH);


		}catch(FileNotFoundException e) {
			e.printStackTrace();

		}try {
			book = WorkbookFactory.create(file);


		}catch(IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for(int i = 0;i< sheet.getLastRowNum();i++) {
			for(int k= 0; k< sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]= sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;

	}

}
