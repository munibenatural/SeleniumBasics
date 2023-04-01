package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGConcepts1 {
	
	public static WebDriver driver;
  @Test
  public void test1() {
	  
	  System.out.println("New TestNG test");
  }
  @BeforeMethod
  public void invokeBrowser()
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  
  }
  @Test
  public void verifyPageTitle()
  {
	  String title=driver.getTitle();
	  if(title.equalsIgnoreCase("Facebook – log in or sign up"))
	  {
		  System.out.println("Test Passed");
	  }
	  else
	  {
		  System.out.println("Test Failed");
	  }
  }
  @Test(invocationCount=5)
  public void Login()
  {
	  
	  WebElement userName=driver.findElement(By.xpath("//input[@name='email']"));
	  WebElement passWord=driver.findElement(By.xpath("//input[@name='pass']"));
	  WebElement logIn=driver.findElement(By.xpath("//button[@name='login']"));
	  if(userName.isDisplayed()&& passWord.isDisplayed()&& logIn.isDisplayed())
	  {
		  System.out.println("Test passed");
	  }
	  else
	  {
		  System.out.println("Test Failed");
	  }
	 
  }
  @AfterMethod()
  public void tearDown()
  {
	  driver.quit();
  }
}
