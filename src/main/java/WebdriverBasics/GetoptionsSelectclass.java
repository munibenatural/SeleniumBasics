package WebdriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetoptionsSelectclass {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement country=driver.findElement(By.name("Country"));
		Select ss=new Select(country);
		List<WebElement> options=ss.getOptions();
		System.out.println(options.size());
		for(int i=0;i<=options.size();i++)
		{
			String text=options.get(i).getText();
			if(text.equalsIgnoreCase("India"))
			{
				ss.selectByVisibleText(text);
				break;
			}
			
		}
		//System.out.println(text);
	}

}
