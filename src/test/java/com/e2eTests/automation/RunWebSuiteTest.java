package com.e2eTests.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;
/**
 * The TestRunner File uses the @RunWith() Annotation for JUnit to execute
 */
@RunWith(Cucumber.class)
/**
 * The @CucumberOptions Annotation is used to define the location of feature,
 * files,stepdefinitions,reporting integration
 */

@CucumberOptions(features = {"src/spec/features"},
                 plugin = {"pretty", "html:target/cucumber-report.html"}, 
                 tags = ("@Authentification"), 
                 //glue = {"step_deficitions"},
                 monochrome = true, 
                 snippets = CAMELCASE

)
/**
 * This class is ised to run the test,which is JUinit Test Runner Class
 * containing the Step Definition location and the other primary data requiered to run the test 
 * */



public class RunWebSuiteTest {

}
