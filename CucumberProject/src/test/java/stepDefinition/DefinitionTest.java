package stepDefinition;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionTest {
	
	@Given("^Lunch site$")
	public void lunch_site() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi");
	   
	}

	@When("^Enter username$")
	public void enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Dakshata");
	}

	@When("^Enter password$")
	public void enter_password() throws Throwable  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("How Are you?");
	}

	@When("^Click on Sign In button$")
	public void click_on_Sign_In_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello");
	}

	@Then("^Site should be launched successfully$")
	public void site_should_be_launched_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("OK");
	   
	}



}
