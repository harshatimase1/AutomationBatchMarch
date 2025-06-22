package practiceSeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Snapdeal {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./PracticeSS/BrowserSS1.png");
		FileHandler.copy(source, target);

		// driver.get("https://www.facebook.com/");
		driver.get("https://www.snapdeal.com/");
		System.out.println(driver.getTitle());

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./PracticeSS/URLSS.png");
		FileHandler.copy(source1, target1);

		WebElement search = driver.findElement(By.cssSelector("input#inputValEnter"));

		search.click();
		search.sendKeys("sarees");

		// another way to declare path

		String projectpath = System.getProperty("user.dir");
		// System.out.println(projectpath);

		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File target2 = new File(projectpath + "\\PracticeSS\\SearchSareeSS.png");
		FileHandler.copy(source2, target2);

	}

}
