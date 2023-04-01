package WebdriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelementsEx {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("raju");
		Thread.sleep(3000);
		username.clear();
		
		

	}

}
