package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericFunction {
	
	public Properties loadpropertiesfile() throws IOException
	{
		FileInputStream fileInput = null;
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\appdata.properties");
		fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		return prop;
	}

}
