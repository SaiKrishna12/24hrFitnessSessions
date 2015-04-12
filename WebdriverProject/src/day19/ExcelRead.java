package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Iterator<Row> row=ws.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
			Iterator<Cell> col=r.iterator();
			
			while(col.hasNext())
			{
			
				Cell c=col.next();
				System.out.print(c.getStringCellValue()+"  ");
			}
			System.out.println();
			
		}
		
		row=ws.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
		
			r.getCell(1).setCellValue("abc");
		}
		int j=ws.getLastRowNum();
		System.out.println(j);
		
		
		FileOutputStream f2=new FileOutputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		wb.write(f2);
		f2.close();
		
		
	

	}

}
