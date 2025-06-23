package automateWebApp;

import dynamicCode.Base_Class;

public class OrangeHRM extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		
		ScreenShot("LaunchBrowserSS1");

		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		
		HitUrl("https://www.railyatri.in/");
		
		
		ScreenShot("HitURL");
		

	}

}
