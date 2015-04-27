package day33.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.IOP.ProfileIdHelper;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sai.utility.ExcelOperations;

public class PomControl1   extends Constants{
	static FirefoxDriver driver=null;
	@Test
	public void pomControlTest() throws IOException
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		 driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*FileInputStream f=new FileInputStream("D:\\10-30SessionOnline\\WebdriverProject\\src\\com\\sai\\excelfiles\\registration11.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");*/
		
		XSSFSheet ws=eo.excelRead(path1,"Sheet1");
		
		Iterator<Row> row=ws.iterator();
		row.next();
		RegisterMercuryTours rm=PageFactory.initElements(driver,RegisterMercuryTours.class);
		RegisterMercuryTours2 rm2=PageFactory.initElements(driver,RegisterMercuryTours2.class);
		
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		wm.menu.registerTest();
		while(row.hasNext())
		{
			Row r=row.next();
			rm.contactInformation(r);
			Boolean b=rm2.validateRegistration(r.getCell(9).getStringCellValue());
			if(b==true)
			{
				Cell c=r.createCell(12);
				c.setCellValue("Passed");
			}
			else
			{
				Cell c=r.createCell(12);
				c.setCellValue("Failed");
			}
			driver.navigate().back();
		}
		/*FileOutputStream f1=new FileOutputStream("D:\\10-30SessionOnline\\WebdriverProject\\src\\com\\sai\\excelfiles\\registration11.xlsx");
		wb.write(f1);
		f1.close();*/
		eo.excelWrite(resultsPath+"\\regResults.xlsx");
		
		
		
		
		
		
		//wm.findAFlight("myusername","mypassword");
		/*driver.navigate().back();
		wm.destinationsTest();
		driver.navigate().back();
		wm.register();
		wm.menu.contactTest();
		driver.navigate().back();
		wm.menu.signonTest();*/
		
		
	}

}
