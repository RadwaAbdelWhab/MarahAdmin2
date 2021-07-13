package Marah.Admin.Panel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Centers extends App {
	
	@BeforeTest
	public void login_with_valid_credentials() throws InterruptedException {

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("admin@kodyonco.com");

		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("6bpw#tKh?NA?Z99M");
		WebElement submit = driver.findElement(By.className("signin"));
		submit.click();
	
	}
	
@Test(priority=1)
public void add_user() throws InterruptedException{
	
	Thread.sleep(3000);
	// go into user page
	//----------------------------------------------------------------
	 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/users/");
	 //System.out.println( driver.getCurrentUrl());
	 //System.out.println(driver.getTitle());
		Thread.sleep(3000);
	 // click on add event button
	//-----------------------------------------------------------------------
	 WebElement submit = driver.findElement(By.className("voyager-plus"));
		submit.click();
		Thread.sleep(3000);
	//-----------------------------------------------------------------------
	// enter name
		WebElement email = driver.findElement(By.id("name"));
		email.clear();
		email.sendKeys("centerAdmin");
		Thread.sleep(3000);

		//-----------------------------------------------------------------------
		// enter email
		WebElement email1 = driver.findElement(By.id("email"));
		email1.clear();
		email1.sendKeys("centerAdmin@gmail.com");
		Thread.sleep(3000);

		//-----------------------------------------------------------------------
		// enter phone
		 WebElement phone = driver.findElement(By.id("phone"));
		 phone.clear();
		 phone.sendKeys("+966500200100");
			Thread.sleep(3000);

	    //-----------------------------------------------------------------------
		// enter password
			 WebElement password = driver.findElement(By.id("password"));
			 password.clear();
			 password.sendKeys("123456");
				Thread.sleep(3000);

		//-------------------------------------------------------------------	 
			 WebElement role_button = driver.findElement(By.className("select2-selection__arrow"));
			 role_button.click();
				Thread.sleep(3000);

				WebElement role1 = driver.findElement(By.xpath("*//*[@class='select2-results__options']/li[3]"));
				role1.click();
				Thread.sleep(3000);

				WebElement save1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form[1]/button"));
                          save1.click();
          				Thread.sleep(3000);

}

@Test(priority=2)

	public void add_center_with_valid_data() throws InterruptedException{
		Thread.sleep(3000);
		// go into center page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/centers");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);
		 // click on add event button
		//-----------------------------------------------------------------------
			 WebElement submit = driver.findElement(By.className("voyager-plus"));
				submit.click();
				Thread.sleep(3000);
	    //-----------------------------------------------------------------------
		// click name center
				WebElement name = driver.findElement(By.name("name"));
				name.sendKeys("center");
				Thread.sleep(3000);
				
	   //-----------------------------------------------------------------------
		// click description center
						WebElement description = driver.findElement(By.name("description"));
						description.sendKeys("center");
						Thread.sleep(3000);
				
		//-----------------------------------------------------------------------
		// click description center
					WebElement place = driver.findElement(By.id("places-autocomplete"));
					place.sendKeys("التجمع");
					Thread.sleep(3000);
		//-----------------------------------------------------------------------
		// click address center
			WebElement place2 = driver.findElement(By.name("address"));
			place2.sendKeys("التجمع");
			Thread.sleep(3000);
				
	
	//-----------------------------------------------------------------------
			// click address center
			WebElement phone = driver.findElement(By.name("phone"));
			phone.sendKeys("+966500100100");
			Thread.sleep(3000);
	//-----------------------------------------------------------------------
		// add date
				WebElement date1 = driver.findElement(By.id("workingFrom"));
				date1.click();
				WebElement hour = driver.findElement(By.xpath("*//*[@class='ti_tx']/input"));
				hour.sendKeys("12");
				Thread.sleep(1000);
				WebElement time = driver.findElement(By.xpath("*//*[@class='meridian']/div[3]"));
				time.click();
				Thread.sleep(3000);
				WebElement min = driver.findElement(By.xpath("*//*[@class='mi_tx']/input"));
				min.sendKeys("00");
				Thread.sleep(1000);
				

				min.sendKeys(Keys.ENTER);

				Thread.sleep(3000);
		//-----------------------------------------------------------------------
		 // add date

						WebElement date_to = driver.findElement(By.id("workingTo"));
						date_to.click();
						Thread.sleep(3000);

						WebElement hour_to = driver.findElement(By.xpath("*//*[@class='ti_tx']/input"));
						hour_to.sendKeys("10");
						Thread.sleep(3000);

						WebElement min_to = driver.findElement(By.xpath("*//*[@class='mi_tx']/input"));
						min_to.sendKeys("00");
						Thread.sleep(3000);

						min_to.sendKeys(Keys.ENTER);
						Thread.sleep(3000);

		//-----------------------------------------
						// add role
						 
			//-------------------------------------------------------------------
				 // select roles
				 
				 WebElement role_button = driver.findElement(By.className("select2-selection__arrow"));
				 role_button.click();
					Thread.sleep(1000);

					WebElement role = driver.findElement(By.xpath("*//*[@class='select2-results__options']/li[1]"));
					role.click();
					Thread.sleep(3000);

							 WebElement number_tickets = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/form/div[1]/div[12]/input"));
								number_tickets.sendKeys("500");
								Thread.sleep(3000);

								WebElement image= driver.findElement(By.name("image"));
						           image.sendKeys("C:\\Users\\tarek\\Desktop\\download.jpg");;
									Thread.sleep(3000);
									WebElement crop = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/form/div[1]/div[15]/div[1]/div/div/button"));
									crop.click();
									Thread.sleep(5000);
						           WebElement cropedimage= driver.findElement(By.id("croppedImage"));
						           cropedimage.isDisplayed();
								     Thread.sleep(6000);
								     WebElement save2 = driver.findElement(By.id("submitBtnCenter"));
			                          save2.click();
					}
	
	
	
}
