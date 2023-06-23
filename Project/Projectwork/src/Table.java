import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Table 
{
	
	public static void main(String args[])
	{
	    String columnXpath = "/html/body/table/tbody/tr[1]/th";
		String rowXpath = "/html/body/table/tbody/tr/td[1]";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\exam2\\Desktop\\L21CS194\\chromedriver_win32\\chromedriver.exe");
		// Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to a web page
       driver.get("file:///C:/Users/exam2/Desktop/L21CS194/Html/index.html");
       List<WebElement> col= driver.findElements(By.xpath(columnXpath));
       System.out.println("No of columns : " + col.size());
	   // Number of rows
	   List<WebElement> rows= driver.findElements(By.xpath(rowXpath));
	   System.out.println("No of rows : " + rows.size());
	}
}
