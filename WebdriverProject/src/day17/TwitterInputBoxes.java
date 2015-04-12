package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwitterInputBoxes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com/");
		List<WebElement> inputboxes=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(inputboxes.size());
		String[] str={"one","two","three","four","five"};
		int j=0;
		for(int i=0;i<inputboxes.size();i++)
		{
			try
			{
				inputboxes.get(i).sendKeys(str[j]);
				j++;
			}
			catch(Exception e)
			{
			
			}
		}

	}

}
