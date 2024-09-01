package Generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	
	protected WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeClass
	public void reportconfig() {
		reports = new ExtentReports("C:\\Users\\singh\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\CWP_Testng\\report.html");
		test = reports.startTest("Naaptol.com_app_and_acc");
		
	}
	
	// We have to create before class and after class
	
	@BeforeMethod
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		
		test.log(LogStatus.PASS, "Chrome Browser is opened");
		
		// Create a property object for fetching data from config.properties
		
		Properties properties = new Properties();
		
		// Give the path of config.properties by using FileInputstream
		
		FileInputStream file = new FileInputStream("C:\\Users\\singh\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\CWP_Testng\\src\\test\\resources\\config.properties");
		
		// Load file in it
		
		properties.load(file);
		
		// Get property is a method to fetch any property from property file
		// Like here URl is a property and call it by using driver.get
		
		String site = properties.getProperty("url"); 
		driver.get(site);
		
		test.log(LogStatus.PASS, "Enter the URL");
		
		// Here we can add some extra features
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		test.log(LogStatus.PASS, "Browser Closed");
		
	}
	
	@AfterClass
	public void flush() {
		reports.flush();
		reports.endTest(test);
	}

}
