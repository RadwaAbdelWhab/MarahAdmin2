package Marah.Admin.Panel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class App {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void webDriver() throws InterruptedException  
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver_win32 (1)\\\\chromedriver.exe" );
		 Thread.sleep(5000);
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/login");
		 System.out.println( driver.getCurrentUrl());
		 System.out.println(driver.getTitle());

	}

	@AfterTest
	public void webDriver1() throws InterruptedException  
	{
		driver.close();
	}
	
}
