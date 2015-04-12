package day28;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiledownloadAutoit {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.45.0")).click();
		Thread.sleep(3000);
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\sai\\Desktop\\download.exe");
		
	}

}
