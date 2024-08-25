package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void before(Scenario sc) {
		System.out.println("Before method");

	}

	@After
	public void after(Scenario sc) {
		System.out.println("After method");

	}
	
	@Before("@Smoke")
	public void before_Smoke() {
		System.out.println("Before Smoke method");
	}

	@After("@Smoke")
	public void After_Smoke(Scenario scenario) {
		System.out.println("After Smoke method");
		if (scenario.isFailed()) {
            // Take screenshot if scenario failed
          //  byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
          //  scenario.attach(screenshot, "image/png", "Screenshot");
        }
}
	
	@Before(order=1)
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }	
	@Before(order=0)
    public void beforeScenario1(){
        System.out.println("-----------------Start of Scenario-----------------");
    }	
	@After(order=0)
    public void afterScenario1(){
        System.out.println("-----------------End of Scenario-----------------");
    }	
	@After(order=1)
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }	

}
