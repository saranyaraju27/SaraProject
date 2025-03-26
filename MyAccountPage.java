package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class MyAccountPage extends BaseClass{
	
	public MyAccountPage (ChromeDriver driver) {
		
		this.driver = driver;	

		
	}
	
	public MyAccountPage clickaccountdropdown() {
		driver.findElement(By.linkText("My Account")).click();
		return this;

	}
	
	public MyAccountPage clickregisteraccount() {
		driver.findElement(By.linkText("Register")).click();
		return this;

	}
	
	public MyAccountPage verifyregister() {
		String element = driver.findElement(By.xpath("//h1[text()='Register Account']")).getText();
		
		if (element.contains("Register Account")) {
			System.out.println("page verified");
		}
		else {
			System.out.println("page not verified");
						}
		return this;		}
	


	public RegisterAccountPage clickcontinue() {
	
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		return new RegisterAccountPage(driver);
		
}
}
