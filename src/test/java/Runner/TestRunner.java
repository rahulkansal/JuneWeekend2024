package Runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/Login.feature",
					glue ="steps",stepNotifications = true, tags="@Smoke",
					plugin = { "pretty", "html:target/cucumber-reports.html" })

public class TestRunner {

}
