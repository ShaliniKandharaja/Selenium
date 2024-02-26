package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

//feature attribute is --> to give path of feature file
                          // Path of feature file
@CucumberOptions(features="src/main/java/features",
                     glue={"steps"},//{"hooks"},  // in glue attribute to integrate Step Definition in the feature file ( have to give Package name of StepDefinition)
                     monochrome=true, //monochrome is to remove junk messages(unreadable characters) from console
                     publish=true, // public attribute to get cucumber report link in the console
                     //tags="@Smoke",  //within the tag , if we give group name, that alone, @Smoke tag scenario only will be executed
                    // tags="not @Smoke", // If we don't want to execute the scenarios, we can use tags="not @Smoke"
                    // tags="@Smoke or @Functional") //It will execute all the scenarios( all test cases)
                     tags="@Functional and @Regression")// Scenario having both category @Functional and @Regression will run
public class CucumberRunner extends BaseClass{

}

//If you want to mention multiple path for feature files , you can mention like,
//features={"src/test/java/features/Login.feature","src/test/java/features/CreateLead.feature"}

//If you want to mention all the files in the features package, you can give like
//features="src/test/java/features"
