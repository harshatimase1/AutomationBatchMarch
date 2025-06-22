package robotClass;

import dynamicCodes.DynamicCodeRobotClass;

public class UploadFileUsingDynamicCode extends DynamicCodeRobotClass {

	public static void main(String[] args) throws Throwable {
		
		launch_Browser("chrome");
		Hiturl("https://www.ilovepdf.com/pdf_to_word");
		
		upload_file("//a[@id='pickfiles']", "\"C:\\Users\\Harsha Timase\\Desktop\\Study materials\\JAVA NOTES\\4. Java Output and Java Comments.pdf\"");
	

	}

}
