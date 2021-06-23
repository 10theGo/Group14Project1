import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_02_AY {

    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.etsy.com/");

        WebElement popup = driver.findElement(By.xpath("//button[@data-gdpr-single-choice-accept='true']"));

        popup.click();

        String searchMaterial ="bohemian sandals";

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

        searchBox.sendKeys(searchMaterial);

        WebElement searchBoxSubmit = driver.findElement(By.xpath("//button[@value='Search']"));

        searchBoxSubmit.click();

        WebElement filterButton = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--secondary wt-display-flex-xs wt-align-items-center']"));

        filterButton.click();

        WebElement customPriceSettingRadio = driver.findElement(By.xpath("//label[@for='price-input-custom']"));

        customPriceSettingRadio.click();

        WebElement lowPriceInput = driver.findElement(By.xpath("//input[@id='search-filter-min-price-input']"));

        lowPriceInput.sendKeys("0");

        WebElement highPriceInput = driver.findElement(By.xpath("//input[@id='search-filter-max-price-input']"));

        highPriceInput.sendKeys("200");

        WebElement submitButton = driver.findElement(By.xpath("//button[@aria-label='Apply']"));

        WebElement results = driver.findElement(By.xpath("//span[contains(text(),'results,')]"));

        String text = results.getText();

        System.out.println("Total results = " + text);

        driver.quit();


    }
}
