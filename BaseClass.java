package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");	
	}
	
//	@BeforeMethod
//	public void preCondition() {
//		
//		startApp("edge", false, "http://leaftaps.com/opentaps/control/main");
//		setNode();
//	}

		@AfterMethod
		public void postCondition(){
			
			driver.close();
		}
		
	}
	
	
	

