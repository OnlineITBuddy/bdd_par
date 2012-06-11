package com.onlineitbuddy.test.automation;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) 
@Cucumber.Options(features = "src/test/resources/com/onlineitbuddy/test/automation/newyork.feature",format = {"pretty", "html:target/cucumber","json:target/newyork.json" })
public class RunNewYorkTests  {
}
