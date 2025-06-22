package practiceTestNG;

import org.testng.annotations.Test;

public class InvocationCount {
  @Test(description = "Enter city name",priority=2)
  public void w() {
	  System.out.println("city");
  }
  //enabled false hence it will not execute the method it will skip but skip count will not show
  @Test(invocationCount =2 ,priority=3,enabled=false)
  public void f() {
	  System.out.println("country");
  }
  @Test(invocationCount = 1,priority=1)
  public void q() {
	  System.out.println("name");
  }
  @Test(priority=4)
  public void p() {
	  System.out.println("district");
  }
}
