package com.assignment.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.assignment.utility.ReadConfig;

public class Baseclass {
	
static ReadConfig readconfig = new ReadConfig();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	 static Properties pro;
	 
	 
	 public static String Baseurl = readconfig.getApplicationurl();

	 public String username = readconfig.getUsername();

	 public String password = readconfig.getPassword();

	 public String chromepath = readconfig.getChromepath();

	 public String firefoxpath = readconfig.getFirefoxpath();
	
	public Baseclass() {
		
		pro= new Properties();
		
		File src = new File("./Configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Execution is" + e.getMessage());
		}
	}

	
	public static void initialization() {
		
		String browserName = readconfig.getApplicationbrowser();
	
		
		
		System.out.println("Thread id : "+Thread.currentThread().getId());
		
		logger= Logger.getLogger("AssignmentMavenProject");
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		
		
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath() );	
			driver = new ChromeDriver();
			}
		
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxpath());
			driver= new FirefoxDriver();
			
		}
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Baseurl);
		
		
	}

	
	
	
	public void captureScreen(WebDriver driver, String tname) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(Source, target);
	}
	
	

}
