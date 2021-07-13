package Marah.Admin.Panel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Services_Types extends App {
	
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
	public void add_services_types() throws InterruptedException{
		// go into user page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/service_types");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);

		 // click on add event button
		//-----------------------------------------------------------------------
		 WebElement Add = driver.findElement(By.className("voyager-plus"));
			Add.click();
			Thread.sleep(3000);
			//-----------------------------------------------------------------
			//enter_services_type
			WebElement type = driver.findElement(By.className("form-control"));
					type.click();
			type.sendKeys("waterball");
			Thread.sleep(3000);
			//-----------------------------------------------------------------------
			//click save button
			WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[2]/button"));
            save.click();
			Thread.sleep(4000);
			//validate it is added successfully
        		 //-------------------------------------------------------------------------------------
 				String xpath5="/html/body/div[3]/div/div";
 				WebElement message = driver.findElement(By.xpath(xpath5));
        					Thread.sleep(1000);
 
        					String message2 = message.getAttribute("innerText");
        					//System.out.println(message.getAttribute("innerText"));
        					message.isDisplayed();
        					Assert.assertEquals(message2, "Successfully Added New Service Type");

			
	}
	
	@Test(priority=2)
	public void delete_services_types() throws InterruptedException{

		

		
		WebElement delete = driver.findElement(By.xpath("*//*[@id='dataTable']/tbody/tr[1]/td[3]/a[1]"));
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
      			Assert.assertEquals(message2, "Successfully Deleted Service Type");

	}
	
	@Test(priority=3)
	public void add_empty_field() throws InterruptedException{
	
		 // click on add event button
		//-----------------------------------------------------------------------
		 WebElement Add = driver.findElement(By.className("voyager-plus"));
			Add.click();
			Thread.sleep(3000);
		
			//-----------------------------------------------------------------------
			//click save button
			WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[2]/button"));
           save.click();
			Thread.sleep(4000);

			//-----------------------------------------------------------------
			//enter_services_type
			String message = driver.findElement(By.className("form-control")).getAttribute("validationMessage");  
			Thread.sleep(3000);
			System.out.println(message);
}
	
	@Test(priority=4)
	
	public void edit_services_types() throws InterruptedException{
		// go into user page
		//----------------------------------------------------------------
		 driver.navigate().to("http://kid-tst.eu-west-1.elasticbeanstalk.com/admin/service_types");
		 //System.out.println( driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
			Thread.sleep(3000);

		 // click on edit event button
		//-----------------------------------------------------------------------
			WebElement edit = driver.findElement(By.xpath("*//*[@id='dataTable']/tbody/tr[1]/td[3]/a[2]"));
			Thread.sleep(3000);
			edit.click();
			//-----------------------------------------------------------------
			//enter_services_type
			WebElement type = driver.findElement(By.className("form-control"));
					type.click();
			type.sendKeys("waterball111111");
			Thread.sleep(3000);
			//-----------------------------------------------------------------------
			//click save button
			WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form[1]/div[2]/button"));
            save.click();
			Thread.sleep(4000);
			//validate it is added successfully
        		 //-------------------------------------------------------------------------------------
 				String xpath5="/html/body/div[3]/div/div";
 				WebElement message = driver.findElement(By.xpath(xpath5));
        					Thread.sleep(1000);
 
        					String message2 = message.getAttribute("innerText");
        					//System.out.println(message.getAttribute("innerText"));
        					message.isDisplayed();
        					Assert.assertEquals(message2, "Successfully Updated Service Type");

			
	}
	
	}
