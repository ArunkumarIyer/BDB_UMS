package com.aqm.bdb.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.bdb.common.pages.AuthorizationMatrix;
import com.aqm.bdb.common.pages.AuthorizationPage;
import com.aqm.bdb.common.pages.CustomerAdministrationPage;
import com.aqm.bdb.common.pages.CustomerMaintenancePage;
import com.aqm.bdb.common.pages.CustomerUserAdminPage;
import com.aqm.bdb.common.pages.DashboardPage;
import com.aqm.bdb.common.pages.LoginPage;
import com.aqm.bdb.common.pages.Reset_Block_User_Page;
import com.aqm.bdb.common.pages.UserLevelLimitPage;
import com.aqm.bdb.constants.Constants;
import com.aqm.bdb.step_definition.Common_StepDefinition;

public class CommonUtils {
	
	public WebDriver driver;
	
	private static CommonUtils utils;
	
	private CommonUtils() {
		
	}
	
	public static CommonUtils getutils() {
		if (utils==null) {
			
			utils= new CommonUtils();
		}
		
		return utils;
		
	}
	

	public static void loadProperties() {

		FileReader reader = null;

		try {

			reader = new FileReader("config.properties");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties properties = new Properties();

		try {
			properties.load(reader);
		} catch (IOException e) {

			e.printStackTrace();
		}

		Constants.APP_URL = properties.getProperty("ApplicationURL");
		Constants.Browser_Name = properties.getProperty("Broswer");
		Constants.Chrome_Driver_Location = properties.getProperty("ChromeDriverLocation");
		Constants.Chrome_Binary_Location = properties.getProperty("ChromeBinary");
		Constants.Chrome_Profile_Location = properties.getProperty("ChromeProfile");
		Constants.Edge_Driver_Location = properties.getProperty("EdgeDriverLocation");
		Constants.Edge_Binary_Location = properties.getProperty("EdgeBinary");
		Constants.Edge_Profile_Location = properties.getProperty("EdgeProfile");
		Constants.VideoRecording=properties.getProperty("VideoRecording");
	}

	
	public static void initWebElements(WebDriver driver) {
		
		PageFactory.initElements(driver, LoginPage.getlogin());
		
		PageFactory.initElements(driver, DashboardPage.getdashboard());
		
		PageFactory.initElements(driver, AuthorizationPage.getauth());
		
		PageFactory.initElements(driver,CustomerAdministrationPage.getcustadmin());
		
		PageFactory.initElements(driver,CustomerMaintenancePage.getcustmaintenance());
		
		PageFactory.initElements(driver, CustomerUserAdminPage.getcustuseradmin());
		
		PageFactory.initElements(driver, Reset_Block_User_Page.getResetBlockUser());
		
		PageFactory.initElements(driver, AuthorizationMatrix.getauthmatrix());
		
		PageFactory.initElements(driver, UserLevelLimitPage.getuserlevellimit());

	}
	
	
	
	
}
