package under_maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillDetails {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("family");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune address");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("90909090");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.cssSelector("input[id='checkbox2']")).click();
	//List <WebElement> list=
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement lang= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='msdd']")));
		lang.click();
		//driver.findElement(By.className("ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all")).click();
	driver.findElement(By.cssSelector(".ui-corner-all>*:nth-child(16)")).click();
		driver.findElement(By.xpath("//body[@class='ng-scope']")).click();
		WebElement list = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(list);
		select.selectByVisibleText("APIs");
	/*	////span[@role='combobox']
		 driver.findElement(By.xpath("//span[@role='combobox']"));
		Select select1 = new Select(countrylist);
		select1.selectByVisibleText("India");*/
		 driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
		
		WebElement yrlist = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select select1 = new Select(yrlist);
		select1.selectByVisibleText("1950");
		
		WebElement mnthlist = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select select2 = new Select(mnthlist);
		select2.selectByVisibleText("December");
		
		WebElement daylist = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select select3 = new Select(daylist);
		select3.selectByVisibleText("19");
		//input[@id='firstpassword']
		//input[@id='secondpassword']
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("abc1234");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("abcf1234");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
	}

}
