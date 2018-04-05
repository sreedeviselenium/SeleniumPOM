package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="D:/eclipse-java-oxygen-3-win32/eclipse/Selenium/FreeCrmBDDFramework/src/main/java/Features/dealsmap.feature"
		,glue= {"StepDefinitions"}
		//,format= {"pretty","test-output"}
		,dryRun=false
		,monochrome=true
		,strict=true
		)
public class TestRunner {

}
