package day32;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GamilLogin_DataProvider {
	@DataProvider(parallel=true)
	public Object[][] myData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="saikrishna123";
		data[0][1]="krishna123";
		data[0][2]="chrome";
		
		data[1][0]="saikrishna123";
		data[1][1]="krishna123";
		data[1][2]="firefox";
		
		return data;
		
	}
	
	
	@Test(dataProvider="myData")
	public void loginTest(String u,String p,String b) throws MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys(u);
		driver.findElement(By.id("Passwd")).sendKeys(p);
		driver.findElement(By.id("signIn")).click();
	}

}
