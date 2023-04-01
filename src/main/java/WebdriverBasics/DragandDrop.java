package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(drag, drop).perform();
		//act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		dragAndDrop(drag,drop);
	}
	//generic method
	
	public static void dragAndDrop(WebElement element,WebElement element1)
	{
		
		Actions act=new Actions(driver);
		act.clickAndHold(element).moveToElement(element1).release().build().perform();
		
	}
	

}
