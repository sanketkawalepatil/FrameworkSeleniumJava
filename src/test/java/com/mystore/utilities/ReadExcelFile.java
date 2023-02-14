package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static FileInputStream inputStream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet excelsheet;
	public static XSSFRow  row;
	public static XSSFCell  Cell;
	
	public static String getCellValue(String FileName, String sheetName, int rowNo, int cellNo)
	{
		try
		{
			inputStream = new FileInputStream(FileName);
			workbook = new XSSFWorkbook(inputStream);
			excelsheet = workbook.getSheet(sheetName);
			Cell = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
			
			workbook.close();
			return Cell.getStringCellValue();
			
			
		}
		catch (Exception e)
		{
			return "";
		}

	}
	
	public static int getRowCount(String fileName, String sheetName)
	{
		try {
			inputStream = new FileInputStream(fileName);
			
			workbook = new XSSFWorkbook(inputStream);
			excelsheet = workbook.getSheet(sheetName);
			
			int tt1Rows = excelsheet.getLastRowNum()+1;
			
			
			workbook.close();
			return tt1Rows;
		
		}
		
		catch(Exception e)
		{
			
			return 0;
		}
	}
	public static int getColCount(String fileName, String sheetName)
	{
		try 
		{
			
		
		FileInputStream inputStream = new FileInputStream(fileName);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet excelsheet = workbook.getSheet(sheetName);
		
		int tt1Cells = excelsheet.getRow(0).getLastCellNum();
		
		
		workbook.close();
		return tt1Cells;
		
	}
	
	catch (Exception e)
	{
		return 0;
	}
	
}
	
}
	

