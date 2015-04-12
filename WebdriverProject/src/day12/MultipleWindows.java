package day12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
	
	FirefoxDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		
		
		driver=new FirefoxDriver();
		driver.get("http://citibank.com");
	}
	
	@Test
	public void multiplewindowtest()
	{
		driver.findElement(By.linkText("Learn More")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
		  driver.switchTo().window(it.next());
		  try
		  {
		     driver.findElement(By.xpath("//*[@id='banner']/div[1]/p[2]/a")).click();
		     break;
		  }
		  catch(Exception e)
		  {
			  
		  }
		}
	}

}
