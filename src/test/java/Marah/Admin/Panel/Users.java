package Marah.Admin.Panel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Users  extends App {
		
		@BeforeTest
		public void login_with_valid_credentials() throws InterruptedException {

			Thread.sleep(1000);

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
		public void add_with_empty_field() throws InterruptedException{
			
			// go into user page
			//----------------------------------------------------------------
			 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/users/");
			 //System.out.println( driver.getCurrentUrl());
			 //System.out.println(driver.getTitle());
				Thread.sleep(3000);
					driver.navigate().refresh();

			 // click on add event button
			//-----------------------------------------------------------------------
			 WebElement Add = driver.findElement(By.className("voyager-plus"));
				Add.click();
				Thread.sleep(3000);
			//-----------------------------------------------------------------------
				//click save button
				WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form[1]/button"));
                save.click();
				Thread.sleep(4000);
				
				//validate alert messages
				//-------------------------------------------------------------------------------------
					WebElement message1 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[1]"));
					String message11= message1.getText();
					Assert.assertEquals(message11, "The Name field is required.");
					WebElement message2 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[2]"));
					String message22= message2.getText();
					Assert.assertEquals(message22, "The password field is required.");
					WebElement message3 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[3]"));
					String message33= message3.getText();
					Assert.assertEquals(message33, "The email field is required.");
					WebElement message4 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[4]"));
					String message44= message4.getText();
					Assert.assertEquals(message44, "The Phone field is required.");
					WebElement message5 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[5]"));
					String message55= message5.getText();
					Assert.assertEquals(message55, "The role field is required.");
				
		}
	@Test(priority=2)
	public void add_user_admin() throws InterruptedException{
		
		// go into user page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/users/");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);
				driver.navigate().refresh();

		 // click on add event button
		//-----------------------------------------------------------------------
		 WebElement Add = driver.findElement(By.className("voyager-plus"));
			Add.click();
			Thread.sleep(3000);
		//-----------------------------------------------------------------------
		// enter name
			WebElement name = driver.findElement(By.id("name"));
			name.clear();
			name.sendKeys("Admin");

			//-----------------------------------------------------------------------
			// enter email
			WebElement email = driver.findElement(By.id("email"));
			email.clear();
			email.sendKeys("Admin@gmail.com");

			//-----------------------------------------------------------------------
			// enter phone
			 WebElement phone = driver.findElement(By.id("phone"));
			 phone.clear();
			 phone.sendKeys("+966500200100");

		    //-----------------------------------------------------------------------
			// enter password
				 WebElement password = driver.findElement(By.id("password"));
				 password.clear();
				 password.sendKeys("123456");

			//-------------------------------------------------------------------
				 // select roles
				 
				 WebElement role_button = driver.findElement(By.className("select2-selection__arrow"));
				 role_button.click();
					Thread.sleep(3000);

					WebElement role = driver.findElement(By.xpath("*//*[@class='select2-results__options']/li[2]"));
					role.click();
					Thread.sleep(3000);

					//-------------------------------------------------------------------
						 // save
					WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form[1]/button"));
	                          save.click();
	          				Thread.sleep(2000);

	          		//validate it is added successfully
	          		 //-------------------------------------------------------------------------------------
	          				String xpath1 = "/html/body/div[3]/div/div" ;	
	          				WebElement message = driver.findElement(By.xpath(xpath1));
	          					Thread.sleep(1000);
	          					String message2 = message.getAttribute("innerText");
	          					System.out.println(message2);
	        	      			message.isDisplayed();
	          					Assert.assertEquals(message2, "Successfully Added New User");



	          				
	}
	
	
	
	@Test(priority=3)
	public void add_user_admin_with_registered_email_phone() throws InterruptedException{
		
		// go into user page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/users/");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);
				driver.navigate().refresh();

		 // click on add event button
		//-----------------------------------------------------------------------
		 WebElement Add = driver.findElement(By.className("voyager-plus"));
			Add.click();
			Thread.sleep(3000);
		//-----------------------------------------------------------------------
		// enter name
			WebElement name = driver.findElement(By.id("name"));
			name.clear();
			name.sendKeys("Admin");

			//-----------------------------------------------------------------------
			// enter email
			WebElement email = driver.findElement(By.id("email"));
			email.clear();
			email.sendKeys("Admin@gmail.com");

			//-----------------------------------------------------------------------
			// enter phone
			 WebElement phone = driver.findElement(By.id("phone"));
			 phone.clear();
			 phone.sendKeys("+966500200100");

		    //-----------------------------------------------------------------------
			// enter password
				 WebElement password = driver.findElement(By.id("password"));
				 password.clear();
				 password.sendKeys("123456");

			//-------------------------------------------------------------------
				 // select roles
				 
				 WebElement role_button = driver.findElement(By.className("select2-selection__arrow"));
				 role_button.click();
					Thread.sleep(3000);

					WebElement role = driver.findElement(By.xpath("*//*[@class='select2-results__options']/li[2]"));
					role.click();
					Thread.sleep(3000);

					//-------------------------------------------------------------------
						 // save
					WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form[1]/button"));
	                          save.click();
	          				Thread.sleep(2000);
	          				
	          				//validate alert messages
	        				//-------------------------------------------------------------------------------------
	        					WebElement message1 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[1]"));
	        					String message11= message1.getText();
	        					Assert.assertEquals(message11, "The email has already been taken.");
	        					WebElement message2 = driver.findElement(By.xpath("*//*[@class='alert alert-danger']/ul/li[2]"));
	        					String message22= message2.getText();
	        					Assert.assertEquals(message22, "The Phone has already been taken.");
	          				
	          				
	}
	
	@Test(priority=4)
	 public void edit_user() throws InterruptedException{

		// go into user page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/users/");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);
				driver.navigate().refresh();


		
		WebElement edit = driver.findElement(By.xpath("*//*[@id='dataTable']/tbody/tr[1]/td[9]/a[2]"));
		Thread.sleep(3000);
		edit.click();
		
		//-----------------------------------------------------------------------
		// change name
			WebElement name = driver.findElement(By.id("name"));
			name.clear();
			name.sendKeys("Admin1");	
			//-------------------------------------------------------------------
			 // save
		WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form[1]/button"));
                 save.click();
 				Thread.sleep(2000);
     //validate it is edited successfully
     		//-------------------------------------------------------------------------------------
       String xpath1="/html/body/div[3]/div/div";
     			WebElement message = driver.findElement(By.xpath(xpath1));
     			Thread.sleep(3000);
     	
     			String message2 = message.getAttribute("innerText");
     			System.out.println(message2);
     			message.isDisplayed();
     			Assert.assertEquals(message2, "Successfully Updated User");
}
	//-------------------------------------------------------------------------------------------------------------	
			@Test(priority=5)
			 public void delete_user() throws InterruptedException{

				// go into user page
				//----------------------------------------------------------------
				 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/users/");
				 //System.out.println( driver.getCurrentUrl());
				 //System.out.println(driver.getTitle());
					Thread.sleep(3000);
						driver.navigate().refresh();

				
				WebElement delete = driver.findElement(By.xpath("*//*[@id='dataTable']/tbody/tr[1]/td[9]/a[1]"));
				Thread.sleep(3000);
				delete.click();
				
				// confirm popup window
				WebElement confirm_delete = driver.findElement(By.xpath("*//*[@id='delete_form']/input[3]"));
				Thread.sleep(3000);
		        confirm_delete.click();	
		        
		      //validate it is deleted successfully
		      		//-------------------------------------------------------------------------------------
		        String xpath="/html/body/div[3]/div/div";
		      			WebElement message = driver.findElement(By.xpath(xpath));
		      			Thread.sleep(3000);
		      	
		      			String message2 = message.getAttribute("innerText");
		      			System.out.println(message2);
		      			message.isDisplayed();
		      			Assert.assertEquals(message2, "Successfully Deleted User");
	}
	  @Test(priority=6)
	
	public void add_user_center_admin() throws InterruptedException{
		
		Thread.sleep(3000);
		// go into user page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/users/");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);
		 // click on add event button
				driver.navigate().refresh();

		//-----------------------------------------------------------------------
		 WebElement Add = driver.findElement(By.className("voyager-plus"));
			Add.click();
			Thread.sleep(3000);
		//-----------------------------------------------------------------------
		// enter name
			WebElement name = driver.findElement(By.id("name"));
			name.clear();
			name.sendKeys("centerAdmin");

			//-----------------------------------------------------------------------
			// enter email
			WebElement email = driver.findElement(By.id("email"));
			email.clear();
			email.sendKeys("centerAdmin@gmail.com");

			//-----------------------------------------------------------------------
			// enter phone
			 WebElement phone = driver.findElement(By.id("phone"));
			 phone.clear();
			 phone.sendKeys("+966500200200");

		    //-----------------------------------------------------------------------
			// enter password
				 WebElement password = driver.findElement(By.id("password"));
				 password.clear();
				 password.sendKeys("123456");

			//-------------------------------------------------------------------
				 // select roles
				 
				 WebElement role_button = driver.findElement(By.className("select2-selection__arrow"));
				 role_button.click();
					Thread.sleep(3000);

					WebElement role = driver.findElement(By.xpath("*//*[@class='select2-results__options']/li[3]"));
					role.click();
					Thread.sleep(3000);

					//-------------------------------------------------------------------
						 // save
					WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form[1]/button"));
	                          save.click();
	          				Thread.sleep(2000);
	          				
	    	          		//validate it is added successfully
	   	          		 //-------------------------------------------------------------------------------------
	          				String xpath3="/html/body/div[3]/div/div";
	   	          					WebElement message = driver.findElement(By.xpath(xpath3));
	   	          					Thread.sleep(1000);
	   	   
	   	          					String message2 = message.getAttribute("innerText");
	   	          					//System.out.println(message.getAttribute("innerText"));
	   	          					message.isDisplayed();
	   	          					Assert.assertEquals(message2, "Successfully Added New User");

	          				
	}
	@Test(priority=7)
	public void add_user_Technical_support() throws InterruptedException{
		
		Thread.sleep(3000);
		// go into user page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/users/");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);
		 // click on add event button
		//-----------------------------------------------------------------------
		 WebElement Add = driver.findElement(By.className("voyager-plus"));
			Add.click();
			Thread.sleep(3000);
		//-----------------------------------------------------------------------
		// enter name
			WebElement name = driver.findElement(By.id("name"));
			name.clear();
			name.sendKeys("Technical_support");

			//-----------------------------------------------------------------------
			// enter email
			WebElement email = driver.findElement(By.id("email"));
			email.clear();
			email.sendKeys("Technicalsupport1@gmail.com");

			//-----------------------------------------------------------------------
			// enter phone
			 WebElement phone = driver.findElement(By.id("phone"));
			 phone.clear();
			 phone.sendKeys("+966500100300");

		    //-----------------------------------------------------------------------
			// enter password
				 WebElement password = driver.findElement(By.id("password"));
				 password.clear();
				 password.sendKeys("123456");

			//-------------------------------------------------------------------
				 // select roles
				 
				 WebElement role_button = driver.findElement(By.className("select2-selection__arrow"));
				 role_button.click();
					Thread.sleep(3000);

					WebElement role = driver.findElement(By.xpath("*//*[@class='select2-results__options']/li[4]"));
					role.click();
					Thread.sleep(3000);

					//-------------------------------------------------------------------
						 // save
					WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form[1]/button"));
	                          save.click();
	          				Thread.sleep(2000);
	    	          		//validate it is added successfully
	   	          		 //-------------------------------------------------------------------------------------
	          				String xpath5="/html/body/div[3]/div/div";
	          				WebElement message = driver.findElement(By.xpath(xpath5));
	   	          					Thread.sleep(1000);
	   	   
	   	          					String message2 = message.getAttribute("innerText");
	   	          					//System.out.println(message.getAttribute("innerText"));
	   	          					message.isDisplayed();
	   	          					Assert.assertEquals(message2, "Successfully Added New User");

	          				
	}
	
	
	
		}
