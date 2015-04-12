import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		Thread.sleep(5000);
		driver.switchTo().frame("pollframe");
		driver.findElement(By.xpath("//*[@id='pollform']/div/a[1]")).click();
		
	}

}
