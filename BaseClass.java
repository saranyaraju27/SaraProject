package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {

	public static ChromeDriver driver;
	
	@BeforeMethod
	
	public void preCondition() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");	

		}

//	@AfterMethod
//	public void postCondition() {
//		
//		driver.close();
//		
//	}
//	
//}

}