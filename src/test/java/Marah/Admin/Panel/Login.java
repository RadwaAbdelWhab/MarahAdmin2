package Marah.Admin.Panel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Login {
	



	public class Login_customer extends App{


		@Test(priority = 1)
		public void login_with_empty_data() throws InterruptedException {

			WebElement submit = driver.findElement(By.className("signin"));
			submit.click();


			WebElement message = driver.findElement(By.className("list-unstyled"));
			String message2 = message.getText();
			Assert.assertEquals(message2, "Email and Password are required fields");
		

		}


		@Test(priority = 3)
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


		@Test(priority = 2)
		public void login_with_invalid_credentials() throws InterruptedException {

			Thread.sleep(3000);

			WebElement email = driver.findElement(By.id("email"));
			email.clear();
			email.sendKeys("hadeerelesh@gmail.com");

			WebElement password = driver.findElement(By.name("password"));
			password.clear();
			password.sendKeys("123456");

			WebElement submit = driver.findElement(By.className("signin"));
			submit.click();


			WebElement message = driver.findElement(By.id("errorList"));
			String message2 = message.getText();
			Assert.assertEquals(message2, "These credentials do not match our records.");


		}

	}

}
