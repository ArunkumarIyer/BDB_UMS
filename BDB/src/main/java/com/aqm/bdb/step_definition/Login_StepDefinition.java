package com.aqm.bdb.step_definition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.bdb.common.pages.LoginPage;
import com.aqm.bdb.constants.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {
	
	public static WebDriver driver;

	@When("Enter maker username {string} and password {string}")
	public void enter_maker_username_and_password(String m_username, String m_password) {
		
		LoginPage.getlogin().setUsername(m_username);
		LoginPage.getlogin().setPassword(m_password);
	    
	}
	
	@When("Enter checker username {string} and password {string}")
	public void enter_checker_username_and_password(String c_username, String c_password) {
		
		LoginPage.getlogin().setUsername(c_username);
		LoginPage.getlogin().setPassword(c_password);
		
	}
	
	
	@When("Click on login")
	public void click_on_login() {
		
		LoginPage.getlogin().clickLoginbutton();
	   
	}
	
	@Then("click on logout button")
	public void click_on_logout_button() {
		LoginPage.getlogin().logOut();
	}
	@When("user logout")
	public void user_logout() {
	    
	}

}
