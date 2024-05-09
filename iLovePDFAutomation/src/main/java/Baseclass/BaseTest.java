package Baseclass;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;

	public BaseTest() {
		prop = new Properties();
		try {
			InputStream input = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
			prop.load(input);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	
	public WebDriver setupDriver() {

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		}

		driver.get("https://www.ilovepdf.com/");

		driver.manage().window().maximize();
		
		return driver;
	}
}
