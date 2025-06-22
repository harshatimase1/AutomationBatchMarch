package practiceTestNG;

import org.testng.annotations.Test;

public class PriorityParameter {
  @Test(priority=5)
  public void a() {
	  System.out.println("a");
  }
  @Test(priority=3)
  public void d() {
	  System.out.println("d");
  }
  @Test(priority=4)
  public void f() {
	  System.out.println("f");
  }
  @Test(priority=2)
  public void r() {
	  System.out.println("r");
  }
  @Test(priority=1)
  public void e() {
	  System.out.println("e");
  }
}
