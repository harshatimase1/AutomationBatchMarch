package practiceTestNG;

import org.testng.annotations.Test;

public class Groups_Parameter {
	//Test 7--High:3 Medium:3 Low:1
  @Test(groups = {"High"})
  public void launchBrowser() {
	  System.out.println("launchBrowser");
  }
  @Test(groups = {"Medium"})
  public void hitUrl() {
	  System.out.println("hitUrl");
  }
  
  @Test(groups = {"Medium"})
  public void searchBox() {
	  System.out.println("searchBox");
  }
  @Test(groups = {"Low"})
  public void cosmetic() {
	  System.out.println("cosmetic");
  }
  @Test(groups = {"Medium"})
  public void text() {
	  System.out.println("text");
  }
  @Test(groups = {"High"})
  public void click() {
	  System.out.println("click");
  }
  @Test(groups = {"High"})
  public void url() {
	  System.out.println("url");
  }
}
