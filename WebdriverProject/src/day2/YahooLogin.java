package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLogin {

	
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		driver.get("http://yahoomail.com");
		driver.findElement(By.name("username")).sendKeys("saikrishna123");
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("krishna123");
		driver.findElement(By.id("login-signin")).click();
		
		
		

	}

}
