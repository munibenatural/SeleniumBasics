package WebdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownConcept {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement country=driver.findElement(By.name("Country"));
		/*
		 * Select sl=new Select(country); sl.selectByVisibleText("India");
		 */
		selectCountry(country,"India");
		

	}
	
	
	  public static void selectCountry(WebElement element, String value)
	  { Select
	  sl=new Select(element); 
	  sl.selectByVisibleText(value);
	  
	  }
	 

}
