package testcaselayer;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.MyAccountPage;

public class Exercise1 extends BaseClass{
	
	@Test
	public void exercisedemo() {
		
		MyAccountPage lp = new MyAccountPage(driver);
		
		lp.clickaccountdropdown();
		lp.clickregisteraccount();
		lp.clickcontinue();
		lp.verifyregister();
		
		
		
		
		
		
		

		
		
		
		
	}


}
