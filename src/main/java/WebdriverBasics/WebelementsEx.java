package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementsEx {
	
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		/*WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("RajuKanth");*/
		By username=By.id("email");
		By password=By.id("pass");
		getWebElement(username).sendKeys("RajuKanth");
		getWebElement(password).sendKeys("7203248");
	}
	
	public static WebElement getWebElement(By Locator)
	{
		
		WebElement element=driver.findElement(Locator);
		return element;
		
	}
}
