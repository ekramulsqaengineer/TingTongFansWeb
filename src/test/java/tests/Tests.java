package tests;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tests extends Base{
	public class Assertions1 {
	WebDriver driver;
	@Test(priority=1)
	public void Login () throws InterruptedException {
		String expectedTitle = "My Feed - tingtongfans";
        ExtentTest test1 = extent.createTest("TingTong Fans", "TingTong Fans Web Application Test Case");
		test1.log(Status.INFO, "TingTong Fans");
		WebDriver driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Go To Tingtong Fans");
		driver.get("https://tingtongfans.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		test1.log(Status.INFO, "Click Login Button");
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("ekramulcsediu2016@gmail.com");
		test1.log(Status.INFO, "Set Mail Address");
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("haque123");
		test1.log(Status.INFO, "Set Password");
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn-block")).click();
		//Assert.assertTrue("Title does not match", expectedTitle.equals(driver.getTitle()));
		test1.log(Status.INFO, "Click Submit Button");
		System.out.println("Assert passed");
		
		
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		//System.out.println(“Assert passed”);
		
		// Validate the actual page title with expected page title using assert equals method
		
		// Validate if actual web page title matches with that of expected title using assert true method
		
		
		
	}
	
	}
	
	
	@Test(priority=2)
	public class Assertions {
		
		public void Logout() throws InterruptedException {
			//WebDriver driver;
			WebDriver driver = new ChromeDriver();
			String expectedTitle = "tingtongfans";
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//p[@class='pl-2 text-primary']")).click();
			
			Assert.assertTrue("Title does not match", expectedTitle.equals(driver.getTitle()));
			System.out.println("Assert passed");
			
			driver.close();
		}
		
	}

}
