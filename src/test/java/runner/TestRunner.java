package runner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//These are the cucumber options. 
//They go between package and class in yout testRunner class:

@RunWith(Cucumber.class)
@CucumberOptions(

features ="classpath:feature", // we provide path of feature folder
glue = "step.definition", // we provide path of step definition classes
tags ="@myCapstonProject", // with tags we will run our test cases
dryRun =false, // DryRun checks if there is any missing step defination class
monochrome =true, // it makes console readable
strict = true, // this will mark a scenario failed if one step failed
plugin = {"pretty","html:target/site/cucumber-pretty",
"json:target/cucumber.json"},
publish= true // this will generate execution report

)

public class TestRunner {
	
	

}
