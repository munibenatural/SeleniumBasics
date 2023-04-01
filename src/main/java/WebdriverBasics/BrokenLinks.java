package WebdriverBasics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++)
		{
			String links=link.get(i).getAttribute("href");
			verifyLink(links);
		}

	}
	public static void verifyLink(String urlLink)
	{
		try
		{
			URL link=new URL(urlLink);
			HttpURLConnection http=(HttpURLConnection)link.openConnection();
			http.setConnectTimeout(2000);
			http.connect();
			if(http.getResponseCode()==200)
			{
				System.out.println(urlLink+" "+http.getResponseMessage());
			}
			if(http.getResponseCode()==400)
			{
				System.out.println(urlLink+" "+http.getResponseMessage());
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
