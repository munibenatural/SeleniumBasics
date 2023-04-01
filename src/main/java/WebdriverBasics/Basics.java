package WebdriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String pageSource=driver.getPageSource();
		//System.out.println(pageSource);
		if(title.equalsIgnoreCase("Facebook – log in or sign up"))
		{
			System.out.println("Opened facebook page");
		}else
		{
			System.out.println("failed opening facebook page");
		}
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		driver.navigate().to("https://www.amazon.in/dp/B0BTH8KPJC?tag=gsmcom05-21&linkCode=osi&th=1&psc=1");
		System.out.println(driver.getTitle());
		//driver.quit();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

}
