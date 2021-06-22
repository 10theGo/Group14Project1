import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_03_AY {

    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.etsy.com/");

        WebElement popup = driver.findElement(By.xpath("//button[@data-gdpr-single-choice-accept='true']"));

        popup.click();

        WebElement jewelryModule = driver.findElement(By.xpath("//li[@data-name='Jewelry & Accessories']"));

        WebElement results = driver.findElement(By.xpath("//span[contains(text(),'results,')]"));

        String text = results.getText();

        System.out.println("Total results = " + text);







    }
}
