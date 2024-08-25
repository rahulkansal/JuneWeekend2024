package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Home Page");
	}

	@When("User Navigate to Login Page")
	public void user_navigate_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login Page");
	}

	@When("User enters Username and Password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("UserNAME and password");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("successfull");
	}
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on login page");
	}
	
	@When("^Enter the username (.+) and password (.+)$")
	public void enter_the_username_user1_and_password_user1(String username, String password) {
		System.out.println(username);
	    System.out.println(password);
	}


		@When("Enter the username and password")
			public void enter_the_username_and_password(DataTable dataTable) {
				List<List<String>> data = dataTable.asLists();
				System.out.println(data.get(0).get(0));
				System.out.println(data.get(0).get(1));   
			}
		
		@When("Initialize Selenium Webdriver")
		public void initialize_selenium_webdriver() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Initialize Selenium Webdriver");
		}

		@Then("Open the browser")
		public void open_the_browser() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Open the browser");
		}


	@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter username " +string +" and password" + string2);
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on submit button");
	}

	@Then("verify Homepage title")
	public void verify_homepage_title() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("verify Homepage title");
	}

}
