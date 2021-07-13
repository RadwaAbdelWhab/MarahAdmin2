package Marah.Admin.Panel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest extends App {
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
	 public void add_event_with_empty() throws InterruptedException{
		Thread.sleep(3000);
		// go into event page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/events/");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);
		 // click on add event button
		//-----------------------------------------------------------------------
		 WebElement submit = driver.findElement(By.className("voyager-plus"));
			submit.click();
			Thread.sleep(3000);
		// click save button
		//-------------------------------------------------------------------------------------
				WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[2]/button"));
				save.click();
				Thread.sleep(3000);
				
				//validate alert messages
				//-------------------------------------------------------------------------------------
					WebElement message1 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[1]"));
					String message11= message1.getText();
					Assert.assertEquals(message11, "The appointment from field is required.");
					WebElement message2 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[2]"));
					String message22= message2.getText();
					Assert.assertEquals(message22, "The name ar field is required.");
					WebElement message3 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[3]"));
					String message33= message3.getText();
					Assert.assertEquals(message33, "The image field is required.");


	}
//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------
	
	
		
		@Test(priority=2)
		 public void add_eventwith_name_only() throws InterruptedException{
			Thread.sleep(3000);
			// go into event page
			//----------------------------------------------------------------
			 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/events/");
	       // click on add event button
			//-----------------------------------------------------------------------
			 WebElement submit = driver.findElement(By.className("voyager-plus"));
				submit.click();
				Thread.sleep(3000);
		  // add name 
		//------------------------------------------------------------------------------		
				WebElement name = driver.findElement(By.name("name"));
				name.sendKeys("Eid_Test");
				Thread.sleep(3000);
		// click save button
	//-------------------------------------------------------------------------------------


					WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[2]/button"));
					save.click();
					Thread.sleep(3000);
					//validate alert message
					//-------------------------------------------------------------------------------------
					WebElement message1 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[1]"));
					String message11= message1.getText();
					Assert.assertEquals(message11, "The appointment from field is required.");
					WebElement message3 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[3]"));
					String message33= message3.getText();
					Assert.assertEquals(message33, "The image field is required.");
				
				
		}
//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------
					
		@Test(priority=3)
		 public void add_event_with_invalid_date() throws InterruptedException{
			Thread.sleep(3000);
			// go into event page
			//----------------------------------------------------------------
			 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/events/");
	       // click on add event button
			//-----------------------------------------------------------------------
			 WebElement submit = driver.findElement(By.className("voyager-plus"));
				submit.click();
				Thread.sleep(3000);
		  // add name 
		//------------------------------------------------------------------------------		
				WebElement name = driver.findElement(By.name("name"));
				name.sendKeys("Eid_Test");
				Thread.sleep(3000);

		// add description
		//-------------------------------------------------------------------------------------
				WebElement description = driver.findElement(By.name("description"));
				description.sendKeys("Eid is new event ,it is run by test automation");
				Thread.sleep(3000);

		// add appointment from
	   //-------------------------------------------------------------------------------------

				
				WebElement appointment_from = driver.findElement(By.name("appointment_from"));
				appointment_from.sendKeys("06/28/2022 1:19 PM");
				Thread.sleep(3000);

		// add appointment from
		//-------------------------------------------------------------------------------------
			
				WebElement appointment_to = driver.findElement(By.name("appointment_to"));
				appointment_to.sendKeys("06/25/2021 1:19 PM");
				Thread.sleep(3000);

		// select type of event
					WebElement menu= driver.findElement(By.className("select2-selection__arrow"));
				menu.click();
				Thread.sleep(3000);

				WebElement type= driver.findElement(By.xpath("*//*[@class='select2-results']/ul/li[1]"));
				type.click();
				Thread.sleep(3000);
				
		//select image
			//-------------------------------------------------------------------------------------
		
				WebElement image= driver.findElement(By.name("image"));
	            image.sendKeys("C:\\Users\\tarek\\Desktop\\download.jpg");;
				Thread.sleep(3000);
				
				WebElement crop = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[1]/div[6]/div/div/div/button"));
				crop.click();
				Thread.sleep(5000);
	            WebElement cropedimage= driver.findElement(By.id("croppedImage"));
	            cropedimage.isDisplayed();
			     Thread.sleep(6000);
			// click save button
			//-------------------------------------------------------------------------------------


				WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[2]/button"));
				save.click();
				Thread.sleep(3000);
				
				//validate alert messages
				//-------------------------------------------------------------------------------------
					WebElement message1 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[1]"));
					String message11= message1.getText();
					Assert.assertEquals(message11, "The appointment to must be a date after or equal to appointment from.");
		}
		
//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------
	
		
		
	@Test(priority=4)
	 public void add_event_special_show() throws InterruptedException{
		Thread.sleep(3000);
		// go into event page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/events/");
       // click on add event button
		//-----------------------------------------------------------------------
		 WebElement submit = driver.findElement(By.className("voyager-plus"));
			submit.click();
			Thread.sleep(3000);
	  // add name 
	//------------------------------------------------------------------------------		
			WebElement name = driver.findElement(By.name("name"));
			name.sendKeys("Eid_Test");
			Thread.sleep(3000);

	// add description
	//-------------------------------------------------------------------------------------
			WebElement description = driver.findElement(By.name("description"));
			description.sendKeys("Eid is new event ,it is run by test automation");
			Thread.sleep(3000);

	// add appointment from
   //-------------------------------------------------------------------------------------

			
			WebElement appointment_from = driver.findElement(By.name("appointment_from"));
			appointment_from.sendKeys("06/28/2022 1:19 PM");
			Thread.sleep(3000);

	// add appointment from
	//-------------------------------------------------------------------------------------
		
			WebElement appointment_to = driver.findElement(By.name("appointment_to"));
			appointment_to.sendKeys("06/30/2021 1:19 PM");
			Thread.sleep(3000);

	// select type of event
				WebElement menu= driver.findElement(By.className("select2-selection__arrow"));
			menu.click();
			Thread.sleep(3000);

			WebElement type= driver.findElement(By.xpath("*//*[@class='select2-results']/ul/li[2]"));
			type.click();
			Thread.sleep(3000);
			
	//select image
		//-------------------------------------------------------------------------------------
	
			WebElement image= driver.findElement(By.name("image"));
            image.sendKeys("C:\\Users\\tarek\\Desktop\\download.jpg");;
			Thread.sleep(3000);
			
			WebElement crop = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[1]/div[6]/div/div/div/button"));
			crop.click();
			Thread.sleep(5000);
            WebElement cropedimage= driver.findElement(By.id("croppedImage"));
            cropedimage.isDisplayed();
		     Thread.sleep(6000);
		// click save button
		//-------------------------------------------------------------------------------------


			WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[2]/button"));
			save.click();
			Thread.sleep(3000);
			
		//validate it is added successfully
		//-------------------------------------------------------------------------------------
			WebElement message = driver.findElement(By.xpath("/html/body/div[3]/div/div"));
			Thread.sleep(3000);
			
			String message2 = message.getAttribute("innerText");
			//System.out.println(message.getAttribute("innerText"));
			message.isDisplayed();
			Assert.assertEquals(message2, "Successfully Added New Event");

			
	}
//-----------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------	
	@Test(priority=5)
	 public void add_event_special_price() throws InterruptedException{
		Thread.sleep(3000);
		// go into event page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/events/");
      // click on add event button
		//-----------------------------------------------------------------------
		 WebElement submit = driver.findElement(By.className("voyager-plus"));
			submit.click();
			Thread.sleep(3000);
	  // add name 
	//------------------------------------------------------------------------------		
			WebElement name = driver.findElement(By.name("name"));
			name.sendKeys("Eid_Test");
			Thread.sleep(3000);

	// add description
	//-------------------------------------------------------------------------------------
			WebElement description = driver.findElement(By.name("description"));
			description.sendKeys("Eid is new event ,it is run by test automation");
			Thread.sleep(3000);

	// add appointment from
  //-------------------------------------------------------------------------------------

			
			WebElement appointment_from = driver.findElement(By.name("appointment_from"));
			appointment_from.sendKeys("06/28/2022 1:19 PM");
			Thread.sleep(3000);

	// add appointment from
	//-------------------------------------------------------------------------------------
		
			WebElement appointment_to = driver.findElement(By.name("appointment_to"));
			appointment_to.sendKeys("06/30/2021 1:19 PM");
			Thread.sleep(3000);

	// select type of event
				WebElement menu= driver.findElement(By.className("select2-selection__arrow"));
			menu.click();
			Thread.sleep(3000);

			WebElement type= driver.findElement(By.xpath("*//*[@class='select2-results']/ul/li[1]"));
			type.click();
			Thread.sleep(3000);
			
	//select image
		//-------------------------------------------------------------------------------------
	
			WebElement image= driver.findElement(By.name("image"));
           image.sendKeys("C:\\Users\\tarek\\Desktop\\download.jpg");;
			Thread.sleep(3000);
			
			WebElement crop = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[1]/div[6]/div/div/div/button"));
			crop.click();
			Thread.sleep(5000);
           WebElement cropedimage= driver.findElement(By.id("croppedImage"));
           cropedimage.isDisplayed();
		     Thread.sleep(6000);
		// click save button
		//-------------------------------------------------------------------------------------


			WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[2]/button"));
			save.click();
			Thread.sleep(3000);
			
		//validate it is added successfully
		//-------------------------------------------------------------------------------------
			WebElement message = driver.findElement(By.xpath("/html/body/div[3]/div/div"));
			Thread.sleep(3000);
			
			String message2 = message.getAttribute("innerText");
			//System.out.println(message.getAttribute("innerText"));
			message.isDisplayed();
			Assert.assertEquals(message2, "Successfully Added New Event");

			
	}
//-----------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------	
	@Test(priority=6)
	 public void delete_event() throws InterruptedException{
		Thread.sleep(3000);
		WebElement delete = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/a[1]"));
		Thread.sleep(3000);
		delete.click();
		
		// confirm popup window
		WebElement confirm_delete = driver.findElement(By.xpath("*//*[@id='delete_form']/input[3]"));
		Thread.sleep(3000);
        confirm_delete.click();	
        
      //validate it is deleted successfully
      		//-------------------------------------------------------------------------------------
      			WebElement message = driver.findElement(By.xpath("/html/body/div[3]/div/div"));
      			Thread.sleep(3000);
      			
      			String message2 = message.getAttribute("innerText");
      			//System.out.println(message.getAttribute("innerText"));
      			message.isDisplayed();
      			Assert.assertEquals(message2, "Successfully Deleted Event");

        
	
	}
	
	
	
	@AfterTest
	public void webDriver1() throws InterruptedException  
	{
		driver.close();
	}
}
