package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEx {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		WebElement frame1=driver.findElement(By.id("frame1"));
		
		//driver.switchTo().frame(frame1);
		switchToframeusingwebelement(frame1);
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		//driver.switchTo().defaultContent();
		switchToframedefault();
		WebElement frame2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		String text2=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text2);
		
		

	}
	public static void switchToframeusingwebelement(WebElement element)
	{
		driver.switchTo().frame(element);
		
	}
	public static void switchToframedefault()
	{
		driver.switchTo().defaultContent();
		
	}
}
