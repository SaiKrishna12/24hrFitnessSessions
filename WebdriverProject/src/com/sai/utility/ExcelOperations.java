package com.sai.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	XSSFWorkbook wb;
	public XSSFSheet excelRead(String path,String sheetname) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet(sheetname);
		return ws;
		
	}
	
	public void excelWrite(String path) throws IOException
	{
		FileOutputStream f1=new FileOutputStream(path);
		wb.write(f1);
		f1.close();
	}

}
