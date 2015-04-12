package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatadrivenTesting3 {

	
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\10-30SessionOnline\\WebdriverProject\\src\\com\\sai\\excelfiles\\Ajax.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill");
		while(row.hasNext())
		{
			
			String phno=null;
			Row r=row.next();
			if(r.getCell(0).getCellType()==r.getCell(0).CELL_TYPE_NUMERIC)
			{
				 phno=Long.toString((long)r.getCell(0).getNumericCellValue());
			}
			else if(r.getCell(0).getCellType()==r.getCell(0).CELL_TYPE_STRING)
			{
				 phno=r.getCell(0).getStringCellValue();
			}
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_mobileNumber")).clear();
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_mobileNumber")).sendKeys(phno);
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_confmobileNo")).click();
			String actajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label")).getText();
			Cell c=r.createCell(2);
			if(driver.findElement(By.xpath("//*[@id='errorHolder']/label")).getText().isEmpty())
			{
				actajax="No Ajax";
			}
			c.setCellValue(actajax);
			
			String expajax=r.getCell(1).getStringCellValue();
			System.out.println(expajax);
			System.out.println(actajax);
			c=r.createCell(3);
			if(actajax.equals(expajax))
			{
				
				c.setCellValue("Passed");
			}
			else
			{
				c.setCellValue("Failed");
			}
		}
		FileOutputStream f1=new FileOutputStream("D:\\10-30SessionOnline\\WebdriverProject\\src\\com\\sai\\resultexcelfiles\\AjaxResults.xlsx");
		wb.write(f1);
		f1.close();
			
	}

}
