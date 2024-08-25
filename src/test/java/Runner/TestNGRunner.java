package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/Login.feature",
glue ="steps")

public class TestNGRunner extends AbstractTestNGCucumberTests{
}
