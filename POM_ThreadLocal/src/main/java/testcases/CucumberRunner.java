package testcases;

import org.testng.annotations.DataProvider;

import base.ProjectSpecificMethods;
import io.cucumber.testng.CucumberOptions;

//feature attribute is --> to give path of feature file
                          // Path of feature file
@CucumberOptions(features="src/main/java/features",
                     glue={"pages"},//{"hooks"},  // in glue attribute to integrate Step Definition in the feature file ( have to give Package name of StepDefinition)
                     monochrome=true, //monochrome is to remove junk messages(unreadable characters) from console
                     publish=true)// public attribute to get cucumber report link in the console
                    
public class CucumberRunner extends ProjectSpecificMethods{
	
	 @DataProvider(parallel=true)
	    public Object[][] scenarios() { // To run Data in Scenario Outline parallely
	        return super.scenarios(); // return super class scenarios
	        }
	 
}

//If you want to mention multiple path for feature files , you can mention like,
//features={"src/test/java/features/Login.feature","src/test/java/features/CreateLead.feature"}

//If you want to mention all the files in the features package, you can give like
//features="src/test/java/features"
