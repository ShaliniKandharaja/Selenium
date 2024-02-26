package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//feature attribute is --> to give path of feature file
                          // Path of feature file
@CucumberOptions(features="src/main/java/features/Login.feature",
                     glue="steps",  // in glue attribute to integrate Step Definition in the feature file ( have to give Package name of StepDefinition)
                     monochrome=true, //monochrome is to remove junk messages(unreadable characters) from console
                     publish=true) // public attribute to get cucumber report link in the console
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
