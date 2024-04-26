package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GooglePageTest {
	WebDriver driver;
	
	@BeforeTest
	//@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	  @Test (alwaysRun = true, dependsOnMethods  = ("seleniumSearchTest"))
	  public void javaSearchTest(){
	  driver.get("https://www.google.com");
	  WebElement srchBox =driver.findElement(By.className("gLFyf"));
	  srchBox.sendKeys("Java Tutorial"); srchBox.submit();
	  Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	  
	  }
	 
	 
  
		/*
		 * @Test public void javaSearchTest(){ driver.get("https://www.google.com");
		 * SoftAssert softAssert = new SoftAssert();
		 * softAssert.assertEquals(driver.getTitle(), "Google Page"); WebElement srchBox
		 * =driver.findElement(By.className("gLFyf"));
		 * srchBox.sendKeys("Java Tutorial"); srchBox.submit();
		 * softAssert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		 * softAssert.assertAll(); }
		 */
  
  @Test
  public void seleniumSearchTest(){
	  driver.get("https://www.google.com");
	  WebElement srchBox =driver.findElement(By.className("gLFyf"));
	  srchBox.sendKeys("Selenium Tutorial");
	  srchBox.submit();
	  Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search Page");
	  
  }
  
 // @Test
  public void cucumberSearchTest(){
	  driver.get("https://www.google.com");
	  WebElement srchBox =driver.findElement(By.className("gLFyf"));
	  srchBox.sendKeys("Cucumber Tutorial");
	  srchBox.submit();
	  Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search");
	  
  }
  
 // @Test
  public void appiumSearchTest(){
	  driver.get("https://www.google.com");
	  WebElement srchBox =driver.findElement(By.className("gLFyf"));
	  srchBox.sendKeys("Appium Tutorial");
	  srchBox.submit();
	  Assert.assertEquals(driver.getTitle(), "Appium Tutorial - Google Search");
	  
  }
  @AfterTest
  //@AfterMethod
  public void teardown() {
	  driver.close();
  }
}
