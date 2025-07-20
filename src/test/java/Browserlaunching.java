import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunching {

    public static void main(String[] args) {

        // Assuming chromedriver is already in your system PATH
        WebDriver driver = new ChromeDriver();

        // Launch Google
        driver.get("https://www.google.com");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
