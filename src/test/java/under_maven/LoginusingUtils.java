package under_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtilities;

public class LoginusingUtils {

	public static void main(String[] args) throws InterruptedException {

		SeleniumUtilities su = new SeleniumUtilities();
		WebDriver driver = su.setup("Chrome","https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("trainee");

		driver.findElement(By.name("pwd")).sendKeys("trainee");


		driver.findElement(By.id("loginButton")).click();		

		su.close();
	}

}
