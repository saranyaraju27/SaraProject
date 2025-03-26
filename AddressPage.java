package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class AddressPage extends BaseClass{
public AddressPage (ChromeDriver driver) {
	this.driver = driver;	
		
	}
	
	public AddressPage enterAddressdetails() {
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
		
		return this;
		
		
	}
	
	public NewletterPage clickcon() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		return new NewletterPage(driver);

		
	}
	

}
