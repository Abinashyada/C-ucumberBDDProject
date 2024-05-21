package testbase;

 
 
 
 
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  

public class TestBase {
	public static Properties prop;
	   public static WebDriver driver;
	
	public TestBase()     {
		
	  prop= new Properties();
	 
		try {
			FileInputStream f= new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberFreamWork\\src\\test\\resources\\config.Properties");
			try {
				prop.load(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public static void initialize() {
	String 	BrowserName= prop.getProperty("browser");
	if(BrowserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\CucumberFreamWork\\driver\\chromedriver.exe" );
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
		
	}
	}
}