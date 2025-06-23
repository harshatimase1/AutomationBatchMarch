package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCode.Base_Class;

public class Dynamic_dropdown extends Base_Class {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		HitUrl("https://www.railyatri.in/");

		javaScriptExecutor("window.scrollBy(0,200)");

		Thread.sleep(4000);
		WebElement from = driver.findElement(By.xpath("//input[@id=\"from_stn_input\"]"));
		from.click();
		from.sendKeys("Nagp");

		Thread.sleep(4000);

		List<WebElement> frm = driver.findElements(By.xpath("//ul[@id=\"ui-id-5\"]//child::li"));
		System.out.println("The size of dropdown is as:"+frm.size());

		
		for (int i = 0; i < frm.size(); i++) {
			
			System.out.println(frm.get(i).getText());

			if (frm.get(i).getText().equalsIgnoreCase("NAGPUR (SE) | NGPB")) {

				frm.get(i).click();
				
				break;

			}

		}

	}

}
