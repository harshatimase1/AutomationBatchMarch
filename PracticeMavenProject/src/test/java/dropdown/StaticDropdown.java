package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamicCodes.PracticeDynamicCode;

public class StaticDropdown extends PracticeDynamicCode {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		Hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");

		WebElement profile = driver.findElement(By.cssSelector("select#reg_relationship"));
		profile.click();

		Select sc = new Select(profile);
		sc.selectByVisibleText("Relative/Friend");

		WebElement day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
		day.click();

		Select sc1 = new Select(day);
		sc1.selectByValue("25");

		WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
		month.click();

		Select sc2 = new Select(month);
		sc2.selectByIndex(3);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//option[text()=\"Never Married\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"chzn-single chzn-default\"])[1]")).click();

		List<WebElement> Religion = (List<WebElement>) driver.findElements(By.xpath("//ul[@class=\"chzn-results\"]//child::li"));
		System.out.println(Religion.size());
		
		for(int a=0;a<=Religion.size();a++) {
			if(Religion.get(a).getText().equalsIgnoreCase("hindu")) {
				Religion.get(a).click();
			}
		}

	}

}
