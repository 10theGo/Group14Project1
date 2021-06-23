import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC7 {

//    TC7: etsy.com Verification – Section 7
//            1. Open Chrome browser
//            2. Go to https://www.etsy.com/
//            3. Print "bohem" in the search box.
//            4. Click "bohemian sandals"' in the dropdown menu
//            5. Click "All Filters" and select FREE shipping.
//            6. Click Apply.
//            7. Check the total result is 8.
    WebDriver driver;

    @BeforeMethod
    public void methodStart(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void filterTest() throws InterruptedException {

        driver.get("https://www.etsy.com/");
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("bohem");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[.='bohemian sandals']")).click();
    }
}
