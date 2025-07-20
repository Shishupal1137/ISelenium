import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSetup {
    WebDriver driver;

    @Test
    public void fillRegistrationForm() throws Exception {
        driver = new ChromeDriver(); // ChromeDriver must be in PATH
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Filling the form
        fillFirstName();
        fillLastName();
        fillAddress();
        fillEmail();
        fillPhone();
        selectMaleGender();
        selectHobbies();
        scrollToBottom();
        clickLanguageDropdown();
        selectLanguage();
        scrollToLastAutocompleteItem();
        selectAdditionalHobby();
        openCountryDropdown();
        searchCountry();
        selectIndia();
        selectDay();
        selectYear();

        // Close browser
        driver.quit();
    }

    public void fillFirstName() {
        driver.findElement(By.xpath("//input[@placeholder ='First Name']")).sendKeys("shishupal");
    }

    public void fillLastName() {
        driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys("singh");
    }

    public void fillAddress() {
        driver.findElement(By.xpath("//textarea[@ng-model = 'Adress']")).sendKeys("indore");
    }

    public void fillEmail() {
        driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("shishupal@gmail.com");
    }

    public void fillPhone() {
        driver.findElement(By.xpath("//input[@ng-model = 'Phone']")).sendKeys("9555537343");
    }

    public void selectMaleGender() {
        driver.findElement(By.xpath("//label[text() = ' Male ']")).click();
    }

    public void selectHobbies() {
        driver.findElement(By.xpath("//label[text() = 'Hobbies']//following::input[1]")).click();
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickLanguageDropdown() {
        driver.findElement(By.xpath("//label[text() = 'Languages']//following::div[1]")).click();
    }

    public void selectLanguage() {
        driver.findElement(By.xpath("//div[@id = 'msdd']//following::li[1]")).click();
    }

    public void scrollToLastAutocompleteItem() {
        WebElement lastItem = driver.findElement(By.xpath("(//ul[contains(@class,'ui-autocomplete')]/li)[last()]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastItem);
    }

    public void selectAdditionalHobby() {
        driver.findElement(By.xpath("//label[text() = 'Hobbies']//following::input[2]")).click();
    }

    public void openCountryDropdown() {
        driver.findElement(By.xpath("//label[text() = 'Select Country :']//following::span[1]")).click();
    }

    public void searchCountry() {
        driver.findElement(By.xpath("//input[@type ='search']")).sendKeys("ind");
    }

    public void selectIndia() {
        driver.findElement(By.xpath("//li[@role = 'treeitem']")).click();
    }

    public void selectDay() {
        driver.findElement(By.xpath("//select[@placeholder = 'Day']")).sendKeys("8");
    }

    public void selectYear() {
        driver.findElement(By.xpath("//select[@placeholder ='Year']")).sendKeys("2001");
    }
}
