package practiceTestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test
  public void launchBrouser() {
	  System.out.println("launchBrouser");
	  
  }
  @Test(dependsOnMethods = "launchBrouser")
  public void hitURL() {
	  System.out.println("hitURL");
  }
  @Test(dependsOnMethods = "hitURL")
  public void webElement() {
	  System.out.println("webElement");
  }
}
