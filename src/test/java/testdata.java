import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testdata {

    public static void main(String[] args) {

        // Directly launch ChromeDriver (assuming chromedriver is in PATH)
        WebDriver driver = new ChromeDriver();

        // Open Flipkart
        driver.get("https://www.flipkart.com");

        // Print the title of the Flipkart page
        System.out.println("Page title is: " + driver.getTitle());

        // Wait for a few seconds to see the page (optional)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
