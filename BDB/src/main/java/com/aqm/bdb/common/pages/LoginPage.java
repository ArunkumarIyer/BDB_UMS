package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aqm.bdb.utilities.BasePage;

public class LoginPage extends BasePage {

	private static LoginPage login;

	private LoginPage() {


	}

	public static LoginPage getlogin() {

		if (login==null) {

			login= new LoginPage();
		}

		return login;
	}


	By Username = By.id("login-username");
	By Password = By.id("password");
	By Loginbutton = By.id("sbmt-span");
	By logOutPage = By.xpath("//span[@class='focusable clickable']");

	public void setUsername(String username) {

		clearAndSendKeys(Username, username);
	}

	public void setPassword(String password) {

		click(Password);
		processing();
		clearAndSendKeys(Password, password);
	}

	public void clickLoginbutton() {

		click(Loginbutton);
		processing();
	}

	public void logOut() {
		driver.switchTo().defaultContent();
		click(logOutPage);

	}

}
