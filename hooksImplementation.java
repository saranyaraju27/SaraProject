package hooks;


import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseClass;

public class hooksImplementation extends BaseClass {
		
		@Before
		public void preCondition() {
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/");	

			}
//		@After
//		public void postCondition() {
//			
//			driver.close();
//			
		
		
			

	}



