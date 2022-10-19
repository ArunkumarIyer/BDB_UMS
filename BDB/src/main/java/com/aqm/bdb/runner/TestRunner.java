
  package com.aqm.bdb.runner;
  
 
  @io.cucumber.testng.CucumberOptions(
  
  
  features="D:\\BDBAutomation\\BDB\\src\\test\\java\\Features\\ResetBlockUser.feature",
  glue="com.aqm.bdb.step_definition",
  dryRun=true, 
  monochrome=true, 
  plugin= {"pretty", 
		  "rerun:target/failed_scenarioc.txt",
  		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
  
  )
  
  
  public class TestRunner {
  
  }
 