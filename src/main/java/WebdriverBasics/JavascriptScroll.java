package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptScroll {

public static WebDriver driver;

	
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		JavaScriptMethods js=new JavaScriptMethods(driver);
		WebElement eleme=driver.findElement(By.xpath("//span[text()='Up to 60% off | Curated furniture picks for your home']"));
		
		//js.scrollBy();
		js.scrollIntoView(eleme);

	}

}
