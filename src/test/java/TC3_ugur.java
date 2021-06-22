import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3_ugur {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void Test1() {
        driver.get("https://www.etsy.com/");
        driver.findElement(By.linkText("Jewelry & Accessories")).click();
        String result1 = driver.findElement(By.xpath("//span[contains(text(),' results,')]")).getText();
        System.out.println(result1);

        driver.navigate().back();





    }
}