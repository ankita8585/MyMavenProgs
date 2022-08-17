package under_maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGFb {

	WebDriver driver;

	@Test
	public void date() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

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

		for(int i=0; i<datelist.size(); i++)
		{

			WebElement datemenu = datelist.get(i);
			System.out.println("date list contains : " + datemenu.getText());

		}


		String defaultdate =date.getFirstSelectedOption().getText();
		System.out.println("default value of date is: "+ defaultdate);


		fbdate.sendKeys("15");
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
		//System.out.println("Date is selected " + fbdate.isSelected());
		System.out.println("Multiple selection of date will return " + date.isMultiple());

	}
	@Test
	public void month()
	{

		WebElement mnth1=driver.findElement(By.xpath("//select[@id='month']"));

		Select mnth = new Select(mnth1);
		//System.out.println("default value of month  "+ mnth.getFirstSelectedOption().getText());



		System.out.println("Month is visible"+ mnth1.isDisplayed());
		System.out.println("Month is enabled " + mnth1.isEnabled());
		System.out.println("Month is selected " + mnth1.isSelected());

		//	mnth.getOptions()
		List<WebElement> mnthlist=driver.findElements(By.xpath("//*[@id='month']/option"));
		System.out.println("Month list count is " + mnthlist.size());

		for(int i=0;i<mnthlist.size();i++) {

			WebElement mnthmenu=mnthlist.get(i);

			System.out.println("Month list contains : " + mnthmenu.getText());

		}
		String defaultmnth =mnth.getFirstSelectedOption().getText();
		System.out.println("default value of month is: "+ defaultmnth);

		mnth.selectByVisibleText("Aug");
		//mnth1.sendKeys("August");


		String actualmnth = mnth.getFirstSelectedOption().getText();
		//System.out.println("Month is selected " + mnth1.isSelected());
		if(defaultmnth.equals(actualmnth))
		{
			System.out.println("Month is not updated " + defaultmnth );
			System.out.println("Month is selected " + mnth1.isSelected());

		}
		else
		{
			System.out.println("Month is updated " + actualmnth);
			System.out.println("Month is selected " + mnth1.isSelected());
		}
	}
	@Test
	public void year()
	{
		WebElement yr1=driver.findElement(By.xpath("//select[@id='year']"));
		//yr1.sendKeys("2020");

		System.out.println("Year is visible"+ yr1.isDisplayed());
		System.out.println("Year is enabled " + yr1.isEnabled());
		System.out.println("Year is selected " + yr1.isSelected());

		Select yr = new Select(yr1);
		System.out.println("default value of year is "+yr.getFirstSelectedOption().getText());


		List <WebElement> yrlist = yr.getOptions();
		System.out.println("Year list count is : " + yrlist.size());

		for(int i=0;i<yrlist.size();i++) {

			WebElement yrmenu=yrlist.get(i);

			System.out.println("Year menu contains " + yrmenu.getText());
		}

		String defaultyr =yr.getFirstSelectedOption().getText();
		System.out.println("default value of month is: "+ defaultyr);

		yr.selectByVisibleText("1947");



		String actualyr = yr.getFirstSelectedOption().getText();
		if(defaultyr.equals(actualyr))
		{
			System.out.println("Year is not updated " + defaultyr );
			System.out.println("Year is selected " + yr1.isSelected());

		}
		else
		{
			System.out.println("Updated year is " + actualyr);
			System.out.println("Year is selected " + yr1.isSelected());
		}

		driver.close();
		
	}


}
