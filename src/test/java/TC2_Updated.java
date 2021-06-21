import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC2_Updated {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
      driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown(){
       // driver.quit();
    }
    @Test
    public void bohemianSandalsItem() throws InterruptedException {
        driver.get("https://www.etsy.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='wt-btn wt-btn--filled wt-mb-xs-0']")).click();

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("bohemian sandals");

        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }

}
