import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "Z://L21CS194//chromedriver_win32//chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to a web page
        driver.get("https://www.google.com");

        // Close the browser
        driver.quit();
    }
}
