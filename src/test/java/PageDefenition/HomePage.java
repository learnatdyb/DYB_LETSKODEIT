package PageDefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {
	
	public String open_letskode()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_JAVA_Projects\\letsKODEit\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		  //Setting Binary Path of Brave Browser in options object.
	    options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	   options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	   
	    //Initializing Chrome Browser Instance
	    WebDriver driver = new ChromeDriver(options);
	    
	  //Maximizing Browser	
	    driver.manage().window().maximize();
	 
	    //Launching https://abodeqa.com
	    driver.get("https://letskodeit.teachable.com/");
	   
	   return driver.getTitle();
	   
	}

}
