package robotClass;

import org.openqa.selenium.By;

import dynamicCode.DynamicRobotClass;

public class Wordtopdf extends DynamicRobotClass{

	public static void main(String[] args) throws Throwable {
		launch_browser("Chrome");
		HitUrl("https://www.ilovepdf.com/word_to_pdf");
		
		
		robot(By.xpath("//a[@title=\"Add more files\"]"), "\"C:\\Users\\Harsha Timase\\Desktop\\Resume_Harsha-Timase_QA_6yearsExp - Copy.docx\"");
		

	}

}
