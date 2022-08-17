package under_maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookmnth {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

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

}
