package under_maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageOption {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement lang= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='msdd']")));
	lang.click();
	//driver.findElement(By.className("ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all")).click();
driver.findElement(By.cssSelector(".ui-corner-all>*:nth-child(16)")).click();
	}

}
