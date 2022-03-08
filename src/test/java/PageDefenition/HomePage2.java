package PageDefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import SPEC.RunTestCase;

public class HomePage2 {
	public  WebDriver driver;
	
	public WebDriver set_browserinstance()
	{
		System.out.println(System.getProperty("user.dir"));
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		  //Setting Binary Path of Brave Browser in options object.
	    options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	    options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	   
	    //Initializing Chrome Browser Instance
	    driver = new ChromeDriver(options);
	    
	    return driver;
	}
	public String open_letskode()
	{
	    //Launching https://abodeqa.com
	    driver.get("https://letskodeit.teachable.com/");
	   
	   return driver.getTitle();
	   
	}

}
