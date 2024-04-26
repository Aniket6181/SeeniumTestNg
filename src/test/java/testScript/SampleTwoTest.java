package testScript;

import org.testng.annotations.Test;

public class SampleTwoTest {
 
	
  @Test(groups="featureOne")
  public void Testone() {
	  System.out.println("Test1 in SampleTwo");
  }
  
  @Test(groups="featureTwo")
  public void Testtwo() {
	  System.out.println("Test2 in SampleTwo");
  }
  
  @Test
  public void Testthree() {
	  System.out.println("Test3 in SampleTwo");
  }
  
  @Test
  public void Testfour() {
	  System.out.println("Test4 in SampleTwo");
  }
}
