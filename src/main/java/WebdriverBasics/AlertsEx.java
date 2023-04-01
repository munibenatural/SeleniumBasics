package WebdriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEx {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		/*
		 * driver.findElement(By.id("alertButton")).click(); Alert
		 * alt1=driver.switchTo().alert(); System.out.println(alt1.getText());
		 * Thread.sleep(3000); alt1.accept();
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("promtButton")).click();
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(4000);
		alt.sendKeys("G Manikyam Raju");
		alt.accept();
		
		


	}

}
