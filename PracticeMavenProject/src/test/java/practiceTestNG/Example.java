package practiceTestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNG.class)
public class Example {
  @Test
  public void f() {
	  System.out.println("f method");
  }
  @Test
  public void a() {
	  System.out.println("a method");
  }
}
