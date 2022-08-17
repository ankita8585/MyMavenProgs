



package under_maven;
	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class FB {
		

		public static void main(String[] args) throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			//https://www.facebook.com/
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			
			//create new a/c button
			
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			
		//	WebElement date=driver.findElement(By.xpath("//*[@id=\'day\']"));
		
	         Thread.sleep(2000);
		WebElement date1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select date = new Select(date1);
        date.selectByValue("19");
       System.out.println(date.getFirstSelectedOption().getText());
		
		
					
			
			System.out.println("date is visible  "+ date1.isDisplayed());
			System.out.println("date is enabled  "+ date1.isEnabled());
			System.out.println("date is selected  "+ date1.isSelected());
			
			
			
			List<WebElement> datelist=driver.findElements(By.xpath("//*[@id='day']/option"));
			System.out.println("datelist count is " + datelist.size());
			
			for(int i=0; i<datelist.size(); i++) {

				WebElement datemenu = datelist.get(i);

				System.out.println("date list contains : " + datemenu.getText());

			}
			
			 date1.sendKeys("26");
			 
			 //if(currentdate==)
			System.out.println("date is selected  "+ date1.isSelected());
			
			

			//WebElement mnth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
			
			Thread.sleep(2000);
			WebElement mnth1=driver.findElement(By.xpath("//select[@id='month']"));
			
			Select mnth = new Select(mnth1);
			System.out.println("default value of month  "+ mnth.getFirstSelectedOption().getText());

			

			System.out.println("Month is visible"+ mnth1.isDisplayed());
			System.out.println("Month is enabled " + mnth1.isEnabled());
			System.out.println("Month is selected " + mnth1.isSelected());
			
				
			List<WebElement> mnthlist=driver.findElements(By.xpath("//*[@id='month']/option"));
			System.out.println("Month list count is " + mnthlist.size());
			
			for(int i=0;i<mnthlist.size();i++) {
				
				WebElement mnthmenu=mnthlist.get(i);
				
				System.out.println("Month list contains : " + mnthmenu.getText());
				
			}
			
			mnth1.sendKeys("August");
			
			//WebElement yr=driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Thread.sleep(2000);
			
			WebElement yr1=driver.findElement(By.xpath("//select[@id='year']"));
			yr1.sendKeys("2020");

			System.out.println("Year is visible"+ yr1.isDisplayed());
			System.out.println("Year is enabled " + yr1.isEnabled());
			System.out.println("Year is selected " + yr1.isSelected());
			
			Select yr = new Select(yr1);
			System.out.println("default value of year is "+yr.getFirstSelectedOption().getText());
			
			
			List <WebElement> yrlist = driver.findElements(By.xpath("//*[@id='year']/option"));
			System.out.println("Year list count is : " + yrlist.size());
			
			for(int i=0;i<yrlist.size();i++) {
				
				WebElement yrmenu=yrlist.get(i);
				
				System.out.println("Year menu contains " + yrmenu.getText());
			}

		//	driver.close();

		}

	}



