package basePackage;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;

public class Baseclass {
//Step 1: to read Config.properties we use FileInputStream and method "load" of Properties class
public static	Properties prop=new Properties();
public static	WebDriver driver;


	public Baseclass() {
		
	try {	
		FileInputStream file=new FileInputStream("C:\\Users\\Alena\\eclipse-workspace\\amazon\\src\\test\\java\\environmentvariables\\Config.properties");
	
		prop.load(file);
	} 
	catch (FileNotFoundException a) {
		 a.printStackTrace();
	 }
	catch (IOException e) {
		
		e.printStackTrace();
	}}
//Step 2: create a static Method where all common commands are kept	
public static void initiation() {
	String browsername=prop.getProperty("browser");
	if (browsername.equals("Chrome")) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (browsername.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time));
}	
}
