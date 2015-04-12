package day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginReflections {
	
	public static ActionKeywordsLogin key;
	public static Method[] method;
	public static String action;
	
	
	
	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		key=new ActionKeywordsLogin();
		method=key.getClass().getMethods();
		
		FileInputStream f=new FileInputStream("D:\\10-30SessionOnline\\WebdriverProject\\src\\com\\sai\\OR\\actions1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			action=r.getCell(3).getStringCellValue();
			executeActions();
		}
	}
	
	
	
	public static  void executeActions() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<method.length;i++)
		{
			if(method[i].getName().equals(action))
			{
				System.out.println(method[i].getName());
				method[i].invoke(key);
			}
		}
	}

}
