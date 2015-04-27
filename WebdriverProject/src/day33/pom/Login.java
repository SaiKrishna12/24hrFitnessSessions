package day33.pom;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	private static Logger log=Logger.getLogger(Login.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser Launched");
		driver.get("http://localhost:8090/orangehrm");
		log.info("Opened Orange HRM");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		log.info("Entered the username");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		log.info("Entered the password");
		driver.findElement(By.id("btnLogin")).click();
		log.info("Clicked on sigin button");
	}

}
