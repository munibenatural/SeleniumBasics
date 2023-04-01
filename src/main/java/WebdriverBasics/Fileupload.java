package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/upload-download");
		
		WebElement upload=driver.findElement(By.id("uploadFile"));
		upload.sendKeys("‪C:\\Users\\Hemanth S\\Desktop\\Videos learning.txt");
		

	}
	
	public static void upload(WebElement element, String path)
	{
		element.sendKeys(path);
	}

}
