package steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class demo extends BaseClass {


	@Given("Verify the title of the page")
	public void verify_the_title_of_the_page() {

		String title = driver.getTitle();
		// System.out.println("Title is " +title);
		String Expected_Title = "Your Store";
		Assert.assertEquals(title, Expected_Title);
		System.out.println("Title Verfied");
	}

	@Given("Click on my account dropdown")
	public void click_on_my_account_dropdown() {
		driver.findElement(By.linkText("My Account")).click();
	}
	
	@And("Click register from dropdown")
	public void click_register_from_dropdown() {
		driver.findElement(By.linkText("Register")).click();
	}
		
		@Then("Verify the register account Page")
		public void verify_the_register_account_page() {
			String element = driver.findElement(By.xpath("//h1[text()='Register Account']")).getText();
			
			if (element.contains("Register Account")) {
				System.out.println("page verified");
			}
			else {
				System.out.println("page not verified");
							}		}
		
		@And("Click on the continue button")
		public void click_on_the_continue_button() {
			
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
		    			
		}
		
		@Then("Verify the warning message")
		public void verify_the_warning_message() {
			 // Verify the error message
			  WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	            String actualMessage = errorMessage.getText();
            String expectedMessage = "alert alert-danger alert-dismissible";
            if (actualMessage.equals(expectedMessage)) {
                System.out.println("Test Passed: Error message verified successfully.");
            } else {
                System.out.println("Test Failed: Expected message '" + expectedMessage + "', but got '" + actualMessage + "'.");
						
		}
		
		
		}
		
		@Then("enter the personal deatils")
		public void enter_the_personal_deatils() {
			
			driver.findElement(By.id("input-firstname")).sendKeys("safra");
			driver.findElement(By.id("input-lastname")).sendKeys("hreiuro");
			driver.findElement(By.id("input-email")).click();
		    Random randomEmail = new Random();
		    int randomInt = randomEmail.nextInt(1000);
		    driver.findElement(By.id("input-email")).sendKeys("rueirn" + randomInt + "@gmail.com");
			//driver.findElement(By.id("input-email")).sendKeys("sara123@gmail.com");
			driver.findElement(By.id("input-telephone")).sendKeys("0465738393");
			driver.findElement(By.id("input-password")).sendKeys("lavin");
			driver.findElement(By.id("input-confirm")).sendKeys("lavin");
			driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@name='agree' and @value='1']")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();

		}		
		
		@And("enter the address details")
		public void enter_the_address_details() {
			
			driver.findElement(By.linkText("Address Book")).click();
			driver.findElement(By.linkText("New Address")).click();
			driver.findElement(By.id("input-firstname")).sendKeys("safra");
			driver.findElement(By.id("input-lastname")).sendKeys("hreiuro");
			driver.findElement(By.id("input-company")).sendKeys("hcl");
			final String myLongString = "weststreeteast";
			final int longStringLength = myLongString.length();
			WebElement elem = driver.findElement(By.id("input-address-1"));
			elem.sendKeys(myLongString);
			int realLength = elem.getCssValue(myLongString).length();
			//assertEquals(longStringLength, realLength);
			driver.findElement(By.id("input-city")).sendKeys("Pune");
			driver.findElement(By.id("input-postcode")).sendKeys("1023");
			WebElement sourceDD = driver.findElement(By.id("input-country"));
			Select dropdown1= new Select(sourceDD);
			dropdown1.selectByIndex(4);
			WebElement sourcecity = driver.findElement(By.id("input-zone"));
			Select dropdown2 = new Select(sourcecity);
			dropdown2.selectByVisibleText("Annaba");
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			
		}

		@Then("enter the newsletter details")
		public void enter_the_newsletter_details() {
			
			driver.findElement(By.linkText("Newsletter")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
		    
		}
		
		@Then("Verify the view order history")
		public void verify_the_view_order_history() {
		    driver.findElement(By.linkText("View your order history")).click();
		    
		    WebElement message = driver.findElement(By.xpath("//p[text()='You have not made any previous orders!']"));
            String actualMessage = message.getText();
        String expectedMessage = "You have not made any previous orders!";
        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed: Expected message '" + expectedMessage + "', but got '" + actualMessage + "'.");
			
		    
		}
		}}

