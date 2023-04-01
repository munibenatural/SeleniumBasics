package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDependsonMethod {
	public static WebDriver driver;
	
	
	@BeforeTest
	public void BrowserInIt()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("hjk")).isDisplayed();
	}
	
	@Test(dependsOnMethods="test1")
	public void test2()
	{
	System.out.println("Its working")	;
	}
	{
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
