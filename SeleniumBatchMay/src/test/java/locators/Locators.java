package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/");

//		//id-locator
//		driver.findElement(By.id("nav-flyout-iss-anchor"));
//		
//		driver.findElement(By.id("nav-belt-search"));
//		driver.findElement(By.id("nav-subnav-toaster"));
//		
//		//Name()
//		driver.findElement(By.name("site-search"));
//		
//		//ClassName()-----value of class 
	//driver.findElement(By.className("navLeftFooter nav-sprite-v1"));

	
	
	//tagname
	//driver.findElements(By.tagName("meta"));
	
		// linketext
		//driver.findElement(By.linkText("Today's Deals"));

		// partial linktext
		//driver.findElement(By.partialLinkText("Today'"));

		// css-selector--cascading style sheet

		// 1)tagname and idvalue---tagname#idvalue

		//driver.findElement(By.cssSelector("div#nav-main"));

      //2)tagname and classvalue----tagname.clasvalue---(if spaces available--remove those spaces with dot)
		
		//driver.findElement(By.cssSelector("div.nav-sprite.nav-progressive-attribute"));
// tagname and attribute---tagname[atrribute="attributevalue"]
		//driver.findElement(By.cssSelector("form[action=\"/s/ref=nb_sb_noss\"]"));
		
		//3) tagname and multiple attribute---tagname[atrribute1="attributevalue1"][atrribute2="valueofsecondattribute"]
		
		//driver.findElement(By.cssSelector("form[action=\"/s/ref=nb_sb_noss\"][role=\"search\"]"));
		
	
	
	//5)css--contains*--tagname[attribute*="value"]
	
	//driver.findElement(By.cssSelector("div[class*=\"navFooterVerticalColumn navAc\"]"));
	
	//6)startswith(^)--tagname[attribute^="value"]
	
	
		//driver.findElement(By.cssSelector("div[class^=\"autocomplete\"]"));
		
		//7)endswith$--tagname[attribute$="value"]
		
		driver.findElement(By.cssSelector("a[id$=\"search\"]"));
		
		//8)pseudoclass
		
		//  first value----:       tagname[attribute="value"] :first-child
		
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :first-child"));
		
		//last child---:  tagname[attribute="value"] :last-child
		
		//eg:  select[id="searchDropdownBox"] :last-child
		
		//nth-child--:  tagname[attribute="value"] :nth-child(n)
		
		//eg: ----select[id="searchDropdownBox"] :nth-child(6)
		
		//nth-last-child(n)--:  tagname[attribute="value"] :nth-last-child(n)
		
		//eg:---select[id="searchDropdownBox"] :nth-last-child(9)
		
		
		//7)xpath: xml path: 
		
		//---------/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
		
		
		//8) xpath--
		driver.findElement(By.xpath("//div[@id=\"a-popover-root\"]"));
			//eg:---(//div[@id="a-popover-root"])[1]
		
		//multiple attribute: --//tagname[@attribute1="value1"][@attribute2="value2"]
		//eg:--//a[@class="nav-a  "][@data-csa-c-id="2xroph-7r0uh5-vixmpr-migdqh"]
		
		//AND operator---//tagname[@attribute1="value1"and @attribute2="value2"]
		
		//eg:--//a[@class="nav-a  " and @data-csa-c-id="2xroph-7r0uh5-vixmpr-migdqh"]
		
		//or operator --////tagname[@attribute1="value1" or @attribute2="value2"]
		
		//eg:--//input[@role="searchbox" or id="twotabsearchtext"]
		
		//xpath--contains--//tagname[contains(@attribute,"value")]
		//eg:--(//a[contains(@class,"nav-a  ")])[14]
		//xpath--//tagname[starts-with(@attribute,"value")]
		
		//eg:--(//a[starts-with(@data-csa-c-type,"link")])[1]
		
		//xpath--text--//tagname[text()="text"]
		//eg:--//a[text()="Buy Again"]
		
		
		
		//xpath---parent and child relationship
		//syntax:---//parenttagname[@parentattribute="value"]//child[@childattribute="value"]
		//eg:--//select[@title="Search in"]//option[@value="search-alias=aps"]
		
		//xpath--select current node or self node of parent or child child
		//syntax:---//tagname[@attribute="value"]//self::currenttagname
		//eg: //option[@value="search-alias=alexa-skills"]//self::option
		//eg:--//select[@aria-describedby="searchDropdownDescription"]//self::select
		
		//select parent node ---//childtagname[@childattribute="value"]//parent::parenttagname
		//eg:://option[@value="search-alias=fashion"]//parent::select
		
		//select child node--//parenttagname[@parentattribute="value"]//child::childtagname
		//eg:--(//select[@data-nav-digest="hhziVplHAm5p3dKrw6I8PjH3ToE="]//child::option)[45]
		//eg:--(//select[@data-nav-digest="hhziVplHAm5p3dKrw6I8PjH3ToE="]//child::option)[1]
		
		
			
	}

}
