package com.aqm.bdb.runner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.codehaus.plexus.util.FileUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



import com.aqm.bdb.utilities.ExcelHandler;
import com.aqm.bdb.utilities.TestDataMap;

import io.cucumber.core.cli.Main;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;



public class TestNgRunner {



	@Test

	//        public static void main(String args[]) throws Throwable {
	public static void runner1() throws IOException  {
		try {
			TestDataMap testdata=new TestDataMap();
			Map<String,String> TestDataInMap=ExcelHandler.getTestDataInMap("D:\\Users\\Temp\\git\\BDB_UMS\\BDB\\TestData\\TestData.xlsx", "Sheet1");
			testdata.setTestDataInMap(TestDataInMap);
			Map<String,String>test=testdata.getTestDataInMap();


			Main.main(new String[] {

					"-g","com.aqm.bdb.step_definition",
					"D:\\Users\\Temp\\git\\BDB_UMS\\BDB\\src\\test\\java\\Features\\"+test.get("FeatureFileName"),
					"--plugin", "pretty", 
					"--plugin", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"--plugin", "json:target/cucumber-report/cucumber.json",
					"-m"
					
					
			});


		} 

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Main method exception : " + e);
		}

	}

}