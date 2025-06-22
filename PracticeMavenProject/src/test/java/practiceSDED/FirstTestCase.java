package practiceSDED;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//1_launch browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
		
		//ChromeBrowser
		WebDriver driver=new ChromeDriver();
		
		//2)open url--https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");
		
		//3)validate title should be "Your Store"
		
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		//4)close browser
		//driver.close();
		driver.quit();
		}

}
