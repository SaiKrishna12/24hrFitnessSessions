package day26;

import org.openqa.selenium.firefox.FirefoxDriver;

public class StringOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String s1="Hello";
		String s2="Hello";
		if(s1==s2)
		{
			System.out.println("They are same");
		}
		else
		{
			System.out.println("They are different");
		}*/
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String str=driver.getCurrentUrl();
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		if(s1.equals(s2))
		{
			System.out.println("They are same");
		}
		else
		{
			System.out.println("They are different");
		}
		
		
	}

}
