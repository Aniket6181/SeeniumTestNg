package testScript;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test(groups="featureOne")
  public void testone() {
	  System.out.println("Testone in SampleThree");
  }
  
  @Test(groups="featureTwo")
  public void testtwo() {
	  System.out.println("Testtwo in SampleThree");
  }
  
  @Test
  public void testthree() {
	  System.out.println("Testhree in SampleThree");
  }
  
  @Test
  public void testfour() {
	  System.out.println("Testfour in SampleThree");
  }
}
