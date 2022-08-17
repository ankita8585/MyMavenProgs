package under_maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDate {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		WebElement fbdate = driver.findElement(By.xpath("//select[@id='day']"));		    
		System.out.println("date is visible  "+ fbdate.isDisplayed());
		System.out.println("date is enabled  "+ fbdate.isEnabled());
		System.out.println("date is selected  "+ fbdate.isSelected());

	
		
		Select date= new Select(fbdate);
		
		//driver.findElements(By.xpath("//*[@id='day']/option"));
		List<WebElement> datelist = date.getOptions();
		System.out.println("datelist count is " + datelist.size());
		
		// System.out.println(datelist.get(2).isSelected());
       
        
		for(int i=0; i<datelist.size(); i++)
		{

			WebElement datemenu = datelist.get(i);
			System.out.println("date list contains : " + datemenu.getText());

		}


		
		String defaultdate =date.getFirstSelectedOption().getText();
		System.out.println("default value of date is: "+ defaultdate);

		
		fbdate.sendKeys("1");
		//WebElement actualdate = date.getFirstSelectedOption();
		String actualdate = date.getFirstSelectedOption().getText();
		if(defaultdate.equals(actualdate))
		{
			System.out.println("Date is not updated " + defaultdate );
			System.out.println("Date is selected " + fbdate.isSelected());

		}
		else
		{
			System.out.println("Date is updated " + actualdate);
			//System.out.println("Date is selected " + fbdate.isSelected());
		}
		System.out.println("Date is selected " + fbdate.isSelected());
		System.out.println("Multiple selection of date will return " + date.isMultiple());
		
}
}