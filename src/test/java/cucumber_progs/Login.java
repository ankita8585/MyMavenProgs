package cucumber_progs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Login {
	//WebDriver driver;
	WebDriver	driver = new ChromeDriver();
	
	
	@Given("Open browser and navigate to url")
	public void open_browser_and_navigate_to_url() {
 
 driver.get("https://demo.actitime.com/login.do");
 driver.manage().window().maximize();
	   
	}

	@When("enter valid username and password")
	public void enter_valid_username_and_password() {
		
	WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
			username.sendKeys("trainee");

	WebElement password= driver.findElement(By.xpath("//input[@name='pwd']"));
			password.sendKeys("trainee");
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='closeProjectLightBoxBtn']")).click();
	    
	}

	@Then("click on the logout button and close the browser")
	public void click_on_the_logout_button_and_close_the_browser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}

}
