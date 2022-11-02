package com.aqm.bdb.step_definition;



import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.aqm.bdb.constants.Constants;
import com.aqm.bdb.utilities.CommonUtils;
import com.aqm.bdb.utilities.MyScreenRecorder;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_StepDefinition {

	public static WebDriver driver;

	private static String ScenarioName = null;

	public static String getScenarioName() {
		return ScenarioName;
	}

	//private static final Logger LOGGER= LogManager.getLogger(Common_StepDefinition.class);

	@Before
	public void beforeScenario(Scenario scenario) {


		ScenarioName = scenario.getName();


		CommonUtils.getutils();
		CommonUtils.loadProperties();

		try {

			if (driver==null) {
				launchBrowser();

				CommonUtils.getutils().initWebElements(driver);
			}
			else {
				launchBrowser();

				CommonUtils.getutils().initWebElements(driver);
				
			}

			driver.navigate().to(Constants.APP_URL);
			driver.manage().window().maximize();


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		if (scenario.isFailed()) {

			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.attach(screenshot, "image/png", ""+Common_StepDefinition.getScenarioName()+"");

		}

	}

	@After

	public void afterScenario() throws Exception {
		
		
		driver.close();
		
		if(Constants.VideoRecording.equals("Yes")) {
			MyScreenRecorder.stopRecording();
		}
		
	}


	public void launchBrowser() throws Exception {
		
		if(Constants.VideoRecording.equals("Yes")) {
			MyScreenRecorder.startRecording("BDB_UMS");
		}

		try {

			switch (Constants.Browser_Name) {
			case "chrome":



				System.setProperty("webdriver.chrome.driver", Constants.Chrome_Driver_Location);
				ChromeOptions chromeopt = new ChromeOptions();

				chromeopt.setBinary(Constants.Chrome_Binary_Location);
				chromeopt.addArguments("--user-data-dir="+Constants.Chrome_Profile_Location+"");
				chromeopt.addArguments("--proxy-server=socks5://127.0.0.1:4000");

				driver = new ChromeDriver(chromeopt);
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15, 1));
				break;

			case "edge":

				System.setProperty("webdriver.edge.driver", Constants.Edge_Driver_Location);

				EdgeOptions opt = new EdgeOptions();

				opt.setBinary(Constants.Edge_Binary_Location);
				opt.addArguments("--user-data-dir="+Constants.Edge_Profile_Location+"");
				opt.addArguments("--proxy-server=socks5://127.0.0.1:4000");

				driver = new EdgeDriver(opt);
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15, 1));
			default:
				System.setProperty("webdriver.chrome.driver", "D:\\BDD_InternetBanking\\BDBib\\Grid\\chromedriver.exe");
				ChromeOptions chromeopt1 = new ChromeOptions();

				chromeopt1.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				chromeopt1.addArguments("--user-data-dir=D:\\Users\\Hussain.Sheik\\proxy-profile\\Default");
				chromeopt1.addArguments("--proxy-server=socks5://127.0.0.1:4000");

				driver = new ChromeDriver(chromeopt1);
				break;
			}


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
