package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class NewletterPage extends BaseClass{

	public NewletterPage (ChromeDriver driver) {
		this.driver = driver;	
		}
	
	
	public NewletterPage enterNewsletter() {
	
	driver.findElement(By.linkText("Newsletter")).click();
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
	return this;
	
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
	}
    
	

}
