package dynamicCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicActionClass {

	public static WebDriver driver;
	public static Actions act;

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		}

		System.out.println("The browser launched is as:" + browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

	}

	public static void HitUrl(String url) {

		driver.get(url);

		System.out.println("The title of webpaage is as :" + driver.getTitle());

	}

	public static void mouseAction(By locator) {

		Actions act = new Actions(driver);
		WebElement element = driver.findElement(locator);
		// act.moveToElement(element).perform();

//act.moveToElement(element).click().build().perform();

act.moveToElement(element).contextClick().build().perform();

//act.moveToElement(element).click().sendKeys("toys").doubleClick().build().perform();

	}

	public static void keyboard() throws Throwable {

		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(3000);

		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_UP).build().perform();

	}

	public static void dragNdrop(By locator, By DragLocator, By DropLocator) {
		WebElement frame = driver.findElement(locator);

		driver.switchTo().frame(frame);

		act = new Actions(driver);

		WebElement drag = driver.findElement(DragLocator);

		WebElement drop = driver.findElement(DropLocator);

		// act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();

		// act.clickAndHold(drag).moveToElement(drop).release().build().perform();

		act.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();

	}

	public static void slider(By framelocator, By sliderLocator) {
		WebElement frame1 = driver.findElement(framelocator);

		driver.switchTo().frame(frame1);

		WebElement slider = driver.findElement(sliderLocator);
		act = new Actions(driver);

		// act.moveToElement(slider).clickAndHold().moveByOffset(200,
		// 0).release().build().perform();

		// act.moveToElement(slider).clickAndHold().moveByOffset(-100,
		// 0).release().build().perform();

		// act.clickAndHold(slider).moveByOffset(300, 0).release().build().perform();

		act.dragAndDropBy(slider, 500, 0).build().perform();

	}

}
