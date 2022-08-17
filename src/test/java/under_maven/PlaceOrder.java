package under_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceOrder {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/cart.html");
	
	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();//place order
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("selenium");
	
	
		

	}

}
