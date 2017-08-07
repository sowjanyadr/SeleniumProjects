package com.mindtree.autodemotours.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements IAUTOCONST{

	public static String getCellValue(String sheet,int r, int c,String path){
		String value = "";
		try{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		value = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e){
			
		}
		return value;
	}
	
	public static int getCellCount(String path, String sheet,int r){
		int rowCount = 0;
		try{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		 rowCount = wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e){
			
		}
		return rowCount;
	}
}
