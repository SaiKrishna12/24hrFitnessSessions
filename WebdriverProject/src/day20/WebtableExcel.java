package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtableExcel {
	
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.timeanddate.com/worldclock/");
	}
	
	@Test
	public void webtableTest() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\webtable.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		WebElement table=driver.findElement(By.xpath("html/body/div[6]/section[2]/div[1]/table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			r=ws.createRow(i);
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				c=r.createCell(j);
				c.setCellValue(cols.get(j).getText());
				
				
			}
			
		}
		FileOutputStream f2=new FileOutputStream("C:\\Users\\sai\\Desktop\\webtable.xlsx");
		wb.write(f2);
		f2.close();
	}


}