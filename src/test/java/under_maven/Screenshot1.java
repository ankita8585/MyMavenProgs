



package under_maven;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
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
		//FileUtils.copyFile(screenshot, new File(".//target//screenshot.png")); 
		FileUtils.copyFile(screenshot,new File(".//target//" + timestamp()+".png"));

		driver.close();
	}
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-mm-dd hh-mm-ss").format(new Date());
	}

}
