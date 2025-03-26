package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class RegisterAccountPage extends BaseClass{
public RegisterAccountPage (ChromeDriver driver) {
	this.driver = driver;	

		
		
	}
	
public RegisterAccountPage enterdetailsaccount() {
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
	return this;
}	
	public AddressPage clickcontinue() {
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.className("smallSubmit")).click();
		return new AddressPage(driver);
	}


}
