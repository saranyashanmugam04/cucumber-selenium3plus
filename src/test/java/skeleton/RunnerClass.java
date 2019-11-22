package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/skeleton/samplefeature.feature",
				glue="skeleton",
				//plugin="html:target/htmlreport",
				plugin="json:target/jsonreport.json")
				//plugin="junit:target/xmlreport.xml")
public class RunnerClass {

}
