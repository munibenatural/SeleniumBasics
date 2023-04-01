package WebdriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoad {
		public static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		pageLoadmethod(10);

	}
	
	public static void pageLoadmethod(int seconds)
	{
		driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}

}
