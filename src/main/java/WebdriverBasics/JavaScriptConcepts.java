package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcepts {
	
	public static WebDriver driver;

	
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		JavaScriptMethods js=new JavaScriptMethods(driver);
		String title=js.getTitlejs();
		System.out.println(title);
		
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement ele=driver.findElement(By.id("alertButton"));
		js.clickElementByJS(ele);
		
		
	}
	
	
}



