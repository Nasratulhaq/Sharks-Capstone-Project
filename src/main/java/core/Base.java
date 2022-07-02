package core;

import java.io.BufferedReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
/**
* This is parent class of all classes in this framework We define the
* properties of Webdriver, Log4J, Properties class so every class in this
* framework can inherit the property of this class and that is implementation
* of Inheritance concept of OOPS.
*/
	// we declare these class on the top our class since we know we will use it, and we will use it throughout the class
public static WebDriver driver; // we just declare them
public static Properties properties; // This class will help us read data from .properties files
public static Logger logger; // this class will help us to log each step of our execution
private String configPath = ".\\src\\test\\resources\\input\\config.properties"; // this is path to config file, we just need to 
// click of config.properties file under src/test/resouce, click on properties and copy the location not the full location but starting src
// we need to add .  before passting the location.
private String log4jPath = ".\\src\\test\\resources\\input\\log4j.properties"; // this is path to log4j file



/**
* we create a constructor to initialize the variables values from the
* config.properties and log4jproperties files.
*/
public Base() {

// we create object of BufferedReader class to read values from the config file
try {
BufferedReader reader = new BufferedReader(new FileReader(configPath));
// bufferreader read that file to us
// file reader finds that class
properties = new Properties(); // we create object of Properties class, this load that file to us
properties.load(reader); // we call .load method and pass reader as argument
reader.close();// we want to close the reader so the input stream should be closed


} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


logger = Logger.getLogger(log4jPath);
//below line of code will configure the property of Log 4 J files.
PropertyConfigurator.configure(log4jPath);

}

/*
* This method will return the value of url from config.properties file
*/
public static String getUrl() {
String url = properties.getProperty("url");
return url;
}
/*
* This method will return the value of browser from config.properties file
*/
public static String getBrowser() {
String browser = properties.getProperty("browser");
return browser;
}

/*
* This method will launch the browser or open the browser
*/
public static void launchBrowser() {
driver.get(getUrl());
}
/*
* This method will close current and all open windows by Webdriver
*/
public static void tearDown() {
driver.close();
driver.quit();
}

// below we select browsers

public void selectBrowser() {
switch(getBrowser()) {
case "chrome":
WebDriverManager.chromedriver().setup();
// in selenium in case our browers was out of date and needed updates they system is throwing an erro and our cases
// we failing due to update required, and we have to update it manually
// but with the help of WeBDriverManager we dont need to worry anymore, it will take the update verison 
// of browser autmatically and we dont need to update it manually. 
driver = new ChromeDriver();
break;
case "ff":
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
break;
case "edge":
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
break;
case "opera":
WebDriverManager.operadriver().setup();
driver = new OperaDriver();
break;
default:
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}

driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
}


