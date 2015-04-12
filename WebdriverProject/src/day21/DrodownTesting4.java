package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DrodownTesting4 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://goair.in/");
	}
	
	@Test
	public void dropdownTest() throws InterruptedException
	{
		WebElement ldrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> list1=ldrop.findElements(By.tagName("option"));
		for(int i=0;i<list1.size();i++)
		{
			String city=list1.get(i).getText();
			System.out.println("############");
			list1.get(i).click();
			Thread.sleep(1000);
			WebElement rdrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			List<WebElement> list2=rdrop.findElements(By.tagName("option"));
			int j;
			for(j=0;j<list2.size();j++)
			{
				if(city.equals(list2.get(j).getText()))
				{
					System.out.println(city+" isnot working correctly");
					break;
				}
				
			}
			if(j==list2.size())
			{
				System.out.println(city+" is working correctly");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
