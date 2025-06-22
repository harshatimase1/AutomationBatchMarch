package practiceTestNG;

import org.testng.annotations.Test;

import dynamicCodes.BaseClass01;

public class SoftAssert extends BaseClass01{
  @Test
  public void url1() {
	  launch_Browser("Chrome");
	  Hiturl("https://amazon.in/");
	  
	  String expected = "https://amazo";
	  String actual = driver.getCurrentUrl();
	  
	  org.testng.asserts.SoftAssert sa=new org.testng.asserts.SoftAssert();
	  sa.assertEquals(actual, expected);
	  
	  System.out.println("The current url is :"+actual);
	  sa.assertAll();	  
	  
	  
  }
}
