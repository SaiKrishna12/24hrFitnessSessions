package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdwonExcel {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\dropdown.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			r=ws.createRow(i);
			c=r.createCell(0);
			c.setCellValue(dropdown.get(i).getText());
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				c=r.createCell(1);
				c.setCellValue("True");
				
			}
			else
			{
				c=r.createCell(1);
				c.setCellValue("True");
			}
		}
		FileOutputStream f2=new FileOutputStream("C:\\Users\\sai\\Desktop\\dropdown.xlsx");
		wb.write(f2);
		f2.close();
		driver.close();
		
	}

	}


