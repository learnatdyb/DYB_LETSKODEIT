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


public class RunTestCase{
	GenericFunction gf = new GenericFunction();
	WebDriver driver;
	@SuppressWarnings("deprecation")
	
	@Test
	public void verify_application_launched() throws IOException
	{
		System.out.println("Running Suite1");
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		  //Setting Binary Path of Brave Browser in options object.
	    options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	    options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	   
	    //Initializing Chrome Browser Instance
	    driver = new ChromeDriver(options);
		HomePage home = new HomePage(driver);
	  //Maximizing Browser	
	    driver.manage().window().maximize();
		Properties prop = gf.loadpropertiesfile();	
		home.open_letskode();
		Assert.assertEquals(prop.getProperty("expectedTitle"), home.open_letskode());
	}

	@Test
	public void sample_failedTC()
	{
		Assert.assertTrue(true);
	}
	@AfterClass
	public void tear_down()
	{
		driver.close();
	}



}
