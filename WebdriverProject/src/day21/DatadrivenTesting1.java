package day21;

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
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatadrivenTesting1 {
	
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void linksTest() throws IOException
	{
		FileInputStream f=new FileInputStream("D:\\10-30SessionOnline\\WebdriverProject\\src\\com\\sai\\excelfiles\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String linkname=r.getCell(0).getStringCellValue();
			driver.findElement(By.linkText(linkname)).click();
			String acturl=driver.getCurrentUrl();
			Cell c=r.createCell(2);
			c.setCellValue(acturl);
			String expurl=r.getCell(1).getStringCellValue();
			if(acturl.equals(expurl))
			{
				c=r.createCell(3);
				c.setCellValue("Passed");
			}
			else
			{
				c=r.createCell(3);
				c.setCellValue("Failed");
			}
			driver.navigate().back();
			
			
		}
		FileOutputStream f1=new FileOutputStream("D:\\10-30SessionOnline\\WebdriverProject\\src\\com\\sai\\resultexcelfiles\\links.xlsx");
		wb.write(f1);
		f1.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
