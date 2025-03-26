package Runner;


	
		
		import io.cucumber.testng.AbstractTestNGCucumberTests;
		import io.cucumber.testng.CucumberOptions;
		import steps.BaseClass;

		//@CucumberOptions(features="src/main/java/features/TC_002CreateLead.feature",glue="steps",monochrome=true,publish=true)
		@CucumberOptions(features="src/main/java/feature", glue="steps",monochrome=true,publish=true,tags="@TC_001")
		public class Runner extends BaseClass{

			
		

	}


