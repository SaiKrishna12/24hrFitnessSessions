package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		
		
		driver=new FirefoxDriver(fp);
		driver.get("http://ishafoundation.org");
	}
	
	@Test
	public void  mousehoverTest() throws InterruptedException
	{
		Actions action=new Actions(driver);
		WebElement menu=driver.findElement(By.id("menu"));
		List<WebElement> links=menu.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			String linkname=links.get(i).getText();
			WebElement event=driver.findElement(By.linkText(linkname));
			action.moveToElement(event).build().perform();
			Thread.sleep(3000);
			
		}
		
		
	}

}
