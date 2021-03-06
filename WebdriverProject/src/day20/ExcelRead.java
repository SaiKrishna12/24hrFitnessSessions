package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
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
				if(c.getCellType()==c.CELL_TYPE_NUMERIC)
				{
					System.out.print(c.getNumericCellValue());
				}
				else if(c.getCellType()==c.CELL_TYPE_STRING)
				{
					System.out.print(c.getStringCellValue());
				}
			}
			System.out.println();
	   }
		
		row=ws.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
			r.createCell(2);
			r.getCell(2).setCellValue("abc");
		}
		FileOutputStream f2=new FileOutputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		wb.write(f2);
		f2.close();
		}

}
