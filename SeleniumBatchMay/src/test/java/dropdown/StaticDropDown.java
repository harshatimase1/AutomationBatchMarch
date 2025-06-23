package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCode.Base_Class;

public class StaticDropDown extends Base_Class{

	public static void main(String[] args) {
		launch_browser("chrome");
		
		
		HitUrl("https://www.jeevansathi.com/");
		//HitUrl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");
//		
//		WebElement profile = driver.findElement(By.xpath("//select[@id=\"reg_relationship\"]"));
//		
//		profile.click();
//		
//		Select s=new Select(profile);
//		
//		s.selectByVisibleText("Daughter");
//		
//		WebElement day = driver.findElement(By.xpath("(//select[@onblur=\"hide_help(this)\"])[1]"));
//		day.click();
//		
//		Select s1=new Select(day);
//		s1.selectByValue("10");
//		
//		WebElement month = driver.findElement(By.xpath("//select[@class=\"fl ml_10 w68\"]"));
//		month.click();
//		
//		Select s2=new Select(month);
//		s2.selectByIndex(6);
//	

		//WebElement profile = driver.findElement(By.xpath("//li[text()=\"Daughter\"]"));
		
		//profile.click();
		
		
		try {
			WebElement profile = driver.findElement(By.cssSelector("ul[class=\"jsx-45f4e8f85b895f2d listnone liHover f14 drop_D\"] :nth-child(3)"));
			
			profile.click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
//		WebElement profile = driver.findElement(By.cssSelector("ul[class=\"jsx-45f4e8f85b895f2d listnone liHover f14 drop_D\"] :nth-child(3)"));
//		
//		profile.click();
		
		
	}

}
