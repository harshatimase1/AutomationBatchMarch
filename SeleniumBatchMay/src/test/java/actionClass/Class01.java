package actionClass;

import org.openqa.selenium.By;

import dynamicCode.DynamicActionClass;

public class Class01 extends DynamicActionClass {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		//HitUrl("https://www.flipkart.com/");

		//HitUrl("https://jqueryui.com/droppable/");
		HitUrl("https://jqueryui.com/slider/");
		//mouseAction(By.xpath("//input[@class=\"Pke_EE\"]"));

		//keyboard();
		
		//dragNdrop(By.xpath("//iframe[@class=\"demo-frame\"]"),By.xpath("//p[text()='Drag me to my target']"),By.xpath("//p[text()='Drop here']"));
		
		
		slider(By.xpath("//iframe[@class=\"demo-frame\"]"), By.xpath("//span[@tabindex=\"0\"]"));
		
	}

}
