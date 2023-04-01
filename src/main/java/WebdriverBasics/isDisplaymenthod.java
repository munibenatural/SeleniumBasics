package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplaymenthod {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.name("login"));
		WebElement forgotPassword=driver.findElement(By.linkText("Forgotten password?"));
		WebElement createAccount=driver.findElement(By.linkText("Create new account"));
		if(username.isDisplayed())
		{
			System.out.println("Element is present");
		}else
		{
			System.out.println("Element is not present");
		}
		if(password.isDisplayed())
		{
			System.out.println("Element is present");
		}else
		{
			System.out.println("Element is not present");
		}
		if(login.isDisplayed())
		{
			System.out.println("Element is present");
		}else
		{
			System.out.println("Element is not present");
		}
		if(forgotPassword.isDisplayed())
		{
			System.out.println("Element is present");
		}else
		{
			System.out.println("Element is not present");
		}
		if(createAccount.isDisplayed())
		{
			System.out.println("Element is present");
		}else
		{
			System.out.println("Element is not present");
		}
		
		
	}

}
