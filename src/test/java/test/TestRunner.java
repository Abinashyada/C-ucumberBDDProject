package test;

 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\CucumberFreamWork\\src\\test\\resources\\featureFiles",glue={"stepDefination",},dryRun= false,
monochrome=true,
//plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
//		"html:target/cucumber-report/cucumber-ntml-report","json:target/cucumber-reports/cucumber-report.json","junit:target/cucumber-report/cucumber.xml"
//		 })
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner { 
 

}
