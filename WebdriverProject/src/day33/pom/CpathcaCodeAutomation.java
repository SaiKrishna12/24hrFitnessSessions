package day33.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CpathcaCodeAutomation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
		long i;
		for( i=0;i<999999999l;i++)
		{
			
		
		driver.findElement(By.id("edit-submitted-name")).sendKeys("test"+i);
		driver.findElement(By.id("edit-submitted-email")).sendKeys("test"+i+"@gmail.com");
		driver.findElement(By.id("edit-submitted-comment")).sendKeys("abc");
		String x=driver.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/fieldset/div/div[2]/span")).getText();
		String[] a=x.split(" ");
		int b=Integer.parseInt(a[0]);
		int c=Integer.parseInt(a[2]);
		int d=b+c;
		
		driver.findElement(By.id("edit-captcha-response")).sendKeys(Integer.toString(d));
		driver.navigate().refresh();
		}
		
	}

}
