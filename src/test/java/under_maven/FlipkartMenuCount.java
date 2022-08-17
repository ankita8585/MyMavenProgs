package under_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtilities;

public class FlipkartMenuCount {

	@Test
	public static void mainMenu() throws InterruptedException {

		SeleniumUtilities su = new SeleniumUtilities();

		WebDriver driver= su.setup("Chrome","https://www.flipkart.com");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
		 
		System.out.println("Main menu total"+ " count is " + list.size());

		for(int i=0; i<list.size(); i++) {

			WebElement menu = list.get(i);

			System.out.println("list contains " + menu.getText());
		
		}
		//driver.close();//giving SocketException
		
	}
}
