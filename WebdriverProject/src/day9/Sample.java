package day9;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@BeforeMethod
	public void fun1()
	{
		System.out.println("This is executed prior to each test case in the current class");
	}
	
	@AfterMethod
	public void fun2()
	{
		System.out.println("This is executed after each test case in the current class");
	}
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	
	
	@Test(priority=2)
	public void registrationTest()
	{
		System.out.println("This is for registration");
	}
	
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout app");
	}

}
