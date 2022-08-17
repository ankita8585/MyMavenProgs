package under_maven;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngScreenShot {

	@Test
	public void login() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//  - Depreciated, do not use this

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();

		//Thread.sleep(5000);  //Before adding username

		WebElement userName = driver.findElement(By.id("username"));

		userName.sendKeys("trainee");

		//Thread.sleep(5000);  //Before adding password

		WebElement passWord = driver.findElement(By.name("pwd"));

		passWord.sendKeys("trainee");

		WebElement login = driver.findElement(By.id("loginButton"));

		//Thread.sleep(5000);  //Before clicking on login button

		login.click();
		
		Thread.sleep(3000);
		File screenshot= driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//target//"+ timestamp()+".png"));
		
		driver.close();
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-mm-dd hh-mm-ss").format(new Date());
	}
}
