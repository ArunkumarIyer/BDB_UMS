package com.aqm.bdb.runner;


@io.cucumber.testng.CucumberOptions(

		features="@target/failed_scenarioc.txt",
		glue="com.aqm.bdb.step_definition",
		dryRun=false,
		monochrome=true
		
		)


public class ReRunner {

}
