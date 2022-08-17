package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	@Test(dataProvider = "LoginData")
	public void logintest(String userValue, String passwdValue) {
		SeleniumUtilities su=new SeleniumUtilities();
		WebDriver driver  = su.setup("Chrome","https://demo.actitime.com/login.do");
	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys(userValue);
	WebElement pwd=	driver.findElement(By.xpath("//input[@placeholder='Password']"));
	pwd.sendKeys(passwdValue);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	}

	@DataProvider(name="LoginData")
		public String[][] getData()
	{
	 String logindata[][] = {{"username123","pwd123"},{"trainee","trainee"}};
		
		return logindata;
	}
}
