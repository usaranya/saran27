package org.cts.samp.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Welcome\\eclipse-workspace\\Adactin\\testfeature\\List.feature"},glue= {"org.cts.samp.Adactin"},monochrome=true,tags={"@smoketest"})

public class Run {

}
