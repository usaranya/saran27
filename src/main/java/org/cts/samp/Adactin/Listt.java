package org.cts.samp.Adactin;


import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Listt {
	public static WebDriver d;
	@Given("^user launches Janie and Jack url$")
	public void user_launches_Janie_and_Jack_url() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Adactin\\driver\\chromedriver.exe");
		  d=new ChromeDriver();
		   d.get("https://www.janieandjack.com");
		   d.manage().window().maximize();  
		   
	    }
	  @When("^user clicks signin link in first page$")
	    public void user_clicks_signin_link_in_first_page() throws Throwable {
	    	d.findElement(By.xpath("//a[@class='user-account'][2]")).click(); 	    
	    }
	  @Then("^user click on create an account link in first page$")
	    public void user_click_on_create_an_account_link_in_first_page() throws Throwable {
		  d.findElement(By.xpath("//li[@class='item'][2]")).click();   
	    }
	    @Then("^user create new account with below data and clicks on create account button$")
	    public void user_create_new_account_with_below_data_and_clicks_on_create_account_button(DataTable dt) throws Throwable {
	    	List<Map<String, String>>mp = dt.asMaps(String.class, String.class);
	    		for(int i=0;i<mp.size();i++) {
	    		d.findElement(By.id("dwfrm_profile_customer_firstname")).sendKeys(mp.get(i).get("FirstName"));
	    		d.findElement(By.id("dwfrm_profile_customer_lastname")).sendKeys(mp.get(i).get("LastName"));
	    		d.findElement(By.id("dwfrm_profile_customer_email")).sendKeys(mp.get(i).get("emailAddress"));
	    		d.findElement(By.id("dwfrm_profile_login_password")).sendKeys(mp.get(i).get("createPassword"));
	    		d.findElement(By.id("dwfrm_profile_login_passwordconfirm")).sendKeys(mp.get(i).get("confirmPassword"));
	    		d.findElement(By.xpath(mp.get(i).get("//button[@name='dwfrm_profile_confirm']"))).click();
	    }   
	    }
}
	    