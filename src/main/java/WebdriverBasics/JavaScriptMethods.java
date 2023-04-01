package WebdriverBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMethods {
	
	public WebDriver driver;
	
	public JavaScriptMethods(WebDriver driver)
	{
		this.driver=driver;
	}
	public String getTitlejs()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		return js.executeScript("return document.title;").toString();
		
	}
	public void clickElementByJS(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void scrollBy()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public void scrollIntoView(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
}


