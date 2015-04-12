package day1;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IELaunch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("http://yahoo.com");
	}

}
