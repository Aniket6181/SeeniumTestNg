package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
  @Test
  public void javaSearchTest(){
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
}
