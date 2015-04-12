package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assesment1 {
	
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("https://news.google.com/");
	}
	
	@Test
	public void headlinesTest()
	{
		List<WebElement> headlines=driver.findElements(By.xpath("//span[@class='titletext']"));
		for(int i=0;i<headlines.size();i++)
		{
			if(!headlines.get(i).getText().isEmpty())
			{
				System.out.println(headlines.get(i).getText());
			}
		}
		driver.close();
	}

}
