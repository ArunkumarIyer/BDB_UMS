package com.aqm.bdb.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.bdb.step_definition.Common_StepDefinition;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class BasePage extends Common_StepDefinition {

	
	
public void takeScreenShot() {
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshot, new File(Common_StepDefinition.getScenarioName()+".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void highlighter(WebElement webElement) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid yellow'", webElement);
	}
	
	public void click(By by) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement	element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			highlighter(element);
			element.click();
			
		} catch (Exception e) {
			highlighter(element);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		}
		
}
	
	public void clearAndSendKeys(By by, String data) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement	element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highlighter(element);
		element.clear();
		element.sendKeys(data);

	}
	
	public void processing() {
		try {
			
			long startTime = System.nanoTime();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.invisibilityOfElementLocated(By.xpath("//div[@class='lds-spinner']")));
			long endTime = System.nanoTime();

			// get the difference between the two nano time valuess
			long timeElapsed = endTime - startTime;

			System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

			

		} catch (Exception e) {
		}
	}
	
	
	public String fetchTextFromApplication(By by, String fieldName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement	element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
		highlighter(element);
		
		String data = element.getText().trim();
		
		ExtentCucumberAdapter.addTestStepLog(fieldName + ": <B>" + data + " </B>" );
		return data;
	}
	
	public void moveToElementUp(By by) {
		WebElement msdWorkflowTab2 = driver.findElement(by);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", msdWorkflowTab2);
		
	}
	
	public void moveToElementDown(By by) {
		WebElement msdWorkflowTab2 = driver.findElement(by);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", msdWorkflowTab2);
		
	}
	
	public String fetchValueFromTextFieldsByReferenceNumber(By by, String fieldName) {
		String[] atributeValue;
		String Value;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement	element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
		highlighter(element);
		
		atributeValue = element.getText().split(" ");
		String message3 = atributeValue[6].trim();
		
		Value = (message3);
		System.out.println(fieldName +":"+Value+" fetched from "+fieldName);

		return Value;
	}
	
	public void selectValueFromList(By by, String value) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement	element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			Select select = new Select(element);
			select.selectByVisibleText(value);
			highlighter(element);
			System.out.println("Selected Value: " + value);
			
		} catch (Exception exception) {
			
		} 
	}
	
	
}
