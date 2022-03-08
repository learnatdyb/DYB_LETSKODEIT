package SPEC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Generic.GenericFunction;
import PageDefenition.HomePage;
import junit.framework.Assert;

public class RunTestCase {
	
	WebDriver driver;
	HomePage home = new HomePage();
	GenericFunction gf = new GenericFunction();
	@SuppressWarnings("deprecation")
	@Test
	public void verify_application_launched() throws IOException
	{
		Properties prop = gf.loadpropertiesfile();		
		Assert.assertEquals(prop.getProperty("expectedTitle"), home.open_letskode());
	}

	@Test
	public void sample_failedTC()
	{
		Assert.assertTrue(false);
	}


}
