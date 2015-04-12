package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\10-30SessionOnline\\WebdriverProject\\ObjectRepository.properties");
		Properties prop=new Properties();
		prop.load(f);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("login"));
	}

}
