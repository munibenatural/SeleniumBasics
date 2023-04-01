package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassEx {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName=driver.findElement(By.id("email"));
		WebElement Password=driver.findElement(By.id("pass"));
		WebElement Login=driver.findElement(By.name("login"));
		Actions act=new Actions(driver);
		act.sendKeys(userName, "Raju").perform();
		act.sendKeys(Password, "78687").perform();
		act.click(Login).perform();
		
		
		
		
		
		

	}
	

}
