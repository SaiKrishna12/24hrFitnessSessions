package day33.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeMercuryTours {
	
	
	Menu menu=null;
	public WelcomeMercuryTours(WebDriver driver)
	{
		if(menu==null)
		{
			menu=PageFactory.initElements(driver,Menu.class);
		}
	}
	@FindBy(name="userName")
	@CacheLookup
	WebElement username;
	@FindBy(name="password")
	@CacheLookup
	WebElement  password;
	@FindBy(name="login")
	@CacheLookup
	WebElement  login;
	public void findAFlight(String username,String password)
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		login.click();
		
	}
	
	
	@FindBy(linkText="your destination")
	WebElement destinations;
	public void destinationsTest()
	{
		destinations.click();
		
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement vacations;
	public void featuredVacations()
	{
		vacations.click();
	}
	
	@FindBy(linkText="Register here")
	WebElement register;
	public void register()
	{
		register.click();
	}
	
	
	
	

}
