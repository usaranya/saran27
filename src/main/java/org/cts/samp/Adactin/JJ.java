package org.cts.samp.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JJ {
	public static WebDriver d;
	
	  @Given("^user launches Janie and Jack url in first page$")
	    public WebDriver user_launches_janie_and_jack_url_in_first_page() throws Throwable {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Adactin\\driver\\chromedriver.exe");
		  d=new ChromeDriver();
		   d.get("https://www.janieandjack.com");
		   d.manage().window().maximize();  
		   return d;
	    }

	 
	    @Then("^user enters \"([^\"]*)\" in email field$")
	    public void user_enters_something_in_email_field(WebElement e,String userName) throws Throwable {
	    	d.findElement(By.id("dwfrm_login_username")).sendKeys("usaranya230@gmail.com");
	     
	    }

	   @Then("^user enters \"([^\"]*)\" in password field$")
	    public void user_enters_something_in_password_field(WebElement f,String passWord) throws Throwable {
	    	d.findElement(By.id("dwfrm_login_password")).sendKeys("udhayak7777");
	    
	    }

	   @Then("^user clicks signin button in the signin page$")
	    public void user_clicks_signin_button_in_the_signin_page(WebElement g) throws Throwable {
	    	d.findElement(By.xpath("//button[@name='dwfrm_login_login']")).click();
	       
	    }
	    @When("^user click on start shopping button in signin page$")
	    public void user_click_on_start_shopping_button_in_signin_page() throws Throwable {
	      
	    }

	   @Then("^user enters product name on search field$")
	    public void user_enters_product_name_on_search_field() throws Throwable {
	 
	    }

	    @And("^user can click a \"([^\"]*)\" from the list of products in next page$")
	    public void user_can_click_a_something_from_the_list_of_products_in_next_page(String product, String strArg1) throws Throwable {
	 
	    }
}
