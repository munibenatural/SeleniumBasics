package WebdriverBasics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("tabButton")).click();
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		String text=driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(text);
		driver.switchTo().window(windows.get(0));
		String home=driver.findElement(By.xpath("//div[text()='Browser Windows']")).getText();
		System.out.println(home);
		
	}

}
