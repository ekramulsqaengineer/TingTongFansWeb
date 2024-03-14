package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Base extends ExtentReportsDemo{
WebDriver driver;
@BeforeTest
public void init() {
	 
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.setProperty("webdriver.chrome.driver", "/Users/afcuser/Desktop/chromedriver");
	WebDriver driver = new ChromeDriver();

	//String projectPath= System.getProperty("user.dir");
	//System.out.println(projectPath);
	
	
}

@Test
public void SampleDemo(){
	
	//test.log(Status.PASS, "Go TingTong Fans Website");
	
	
	//test.log(Status.PASS, "Maximize window");
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//test.log(Status.PASS, "Wait 10 sec");
	
	
	//System.out.println("Test Complite");
	//driver.close();
}

@AfterTest
public void tearDwon() {
	
}

}
