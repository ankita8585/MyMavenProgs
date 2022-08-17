package under_maven;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtilities;

public class cricin {

	@Test	
	public static void cricInfo() throws InterruptedException {

		SeleniumUtilities su = new SeleniumUtilities();

		WebDriver driver= su.setup("Chrome","https://www.espncricinfo.com/");

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ds-popper-wrapper']"));

		System.out.println("Total main menu count is " + list.size());

		for(int i=0; i<list.size(); i++) {

			WebElement menu = list.get(i);

			System.out.println("list contains " + menu.getText());

		}
		su.close();

	}
}

