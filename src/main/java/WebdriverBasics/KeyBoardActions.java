package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {


	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement userName=driver.findElement(By.id("userName"));
		WebElement eMail=driver.findElement(By.id("userEmail"));
		
		userName.sendKeys("Manikyam Raju");
		userName.sendKeys(Keys.CONTROL,"a");
		userName.sendKeys(Keys.CONTROL,"c");
		userName.sendKeys(Keys.TAB);
		eMail.sendKeys(Keys.CONTROL,"v");
	}

}
