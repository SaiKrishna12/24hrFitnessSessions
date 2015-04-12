package day25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void loginTest() throws IOException
	{
		
		Properties prop=new Properties();
		FileInputStream f=new FileInputStream("D:\\10-30SessionOnline\\WebdriverProject\\ObjectRepository.properties");
		prop.load(f);
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8090/orangehrm");
		driver.findElement(By.id(prop.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.id(prop.getProperty("password"))).sendKeys("Admin");
		driver.findElement(By.id(prop.getProperty("login"))).click();
		
	}

}
