package com.amazon.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\seleniumgitprojectslocalrep\\com-amazon-cucmber\\src\\test\\resources\\features",
glue= {"com.amazon.stepdefs"},tags="@Regression",
plugin= {"rerun:target/rerunfailed.txt","html:target/customhtmlreprt.html",
		"json:target/customjsonreport.json","junit:target/customjunitreport.xml","pretty"})
public class TestRunner {

}
