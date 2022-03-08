package PageDefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import SPEC.Base;
import SPEC.RunTestCase;

public class HomePage {
	public  WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public String open_letskode()
	{
		System.out.println(System.getProperty("user.dir"));
		
	   
	    //Launching https://abodeqa.com
	    driver.get("https://letskodeit.teachable.com/");
	   
	   return driver.getTitle();
	   
	}

}
