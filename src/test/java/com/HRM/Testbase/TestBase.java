package com.HRM.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
public TestBase()
{
	
	try {
		//Read Data from config.properties file
		FileInputStream ip=new FileInputStream("D:\\Java-MX\\com.OrangeHRM.pom\\src\\test\\java\\com\\OrangeHRM\\configuration\\config.properties");
		
		//Initialize property class
		prop=new Properties();
		
		//Load Properties file in memory
		prop.load(ip);
	
	} 
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void initialization()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	

}
