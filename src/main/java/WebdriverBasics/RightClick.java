package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	 
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement righClick=driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		
		
		//righClick(righClick);
		//driver.findElement(By.xpath("//*[text()='Edit']")).click();
		Actions act=new Actions(driver);
		act.doubleClick(righClick).perform();
		
		//driver.switchTo().alert().accept();
		

	}
	
	public static void righClick(WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
}
