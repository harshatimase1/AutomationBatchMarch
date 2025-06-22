package practiceTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dynamicCodes.BaseClass01;
import junit.framework.Assert;

public class HardAssert extends BaseClass01{
  @Test
  public void url() {
	  
	  launch_Browser("Chrome");
	  Hiturl("https://www.jiomart.com/");
	  
	  String expected_url = "https://www.jiomart";
	  String actual_url = driver.getCurrentUrl();
	  
	 // Assert.assertEquals(actual_url, expected_url);
	  //Assert.assertNotSame(expected_url, actual_url);
	  
	  //assertTrue
	  Assert.assertTrue(actual_url.equals(expected_url));
	  
	  //System.out.println("The actual url is :"+actual_url);
	  
	  String expected_element = "Home & Lifestyle";
	  
	  String actual_element = driver.findElement(By.xpath("Home & Lifestyle")).getText();
	  
	  Assert.assertEquals(actual_element, expected_element);
	  System.out.println("The actual web element is :"+actual_element);
  }
}
