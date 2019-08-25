package org.cts.samp.Adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testone {

	 @Given("^entering demo automationtesting url$")
	    public void entering_demo_automationtesting_url() throws Throwable {
	      System.out.println("entering demo automationtesting url"); 
	    }

	    @When("^user entering \"([^\"]*)\" And \"([^\"]*)\"And \"([^\"]*)\"And \"([^\"]*)\" And \"([^\"]*)\"$")
	    	public void user_entering_something_and_somethingand_somethingand_something_and_something(String firstname, String lastname, String address, String emailaddress, String phonenumber, String strArg1, String strArg2, String strArg3, String strArg4, String strArg5) throws Throwable {    

System.out.println("user entering \\\"([^\\\"]*)\\\" And \\\"([^\\\"]*)\\\"And \\\"([^\\\"]*)\\\"And \\\"([^\\\"]*)\\\" And \\\"([^\\\"]*)\\\"");
  
    }
	    @Then("^user click on \"([^\"]*)\"$")
	    public void user_click_on_something(String gender, String strArg1) throws Throwable {
	        
	    }

	    @Then("^user selecting \"([^\"]*)\" in dropdown$")
	    public void user_selecting_something_in_dropdown(String skills, String strArg1) throws Throwable {
	     
	    }

}
