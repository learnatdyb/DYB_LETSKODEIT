package SPEC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Generic.GenericFunction;
import PageDefenition.HomePage;
import PageDefenition.HomePage2;


public class RunTestCase2{
	GenericFunction gf = new GenericFunction();
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	
	@Test
	public void verify_application_launched2() throws IOException
	{
		System.out.println("Running Suite2");
		HomePage2 home = new HomePage2();
	  //Maximizing Browser
		driver = home.set_browserinstance();
	    driver.manage().window().maximize();
		Properties prop = gf.loadpropertiesfile();	
		home.open_letskode();
		Assert.assertEquals(prop.getProperty("expectedTitle"), home.open_letskode());
	}

	@Test
	public void sample_failedTC2()
	{
		Assert.assertTrue(true);
	}
	@AfterClass
	public void tear_down()
	{
		driver.close();
	}



}
