import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_AY {
    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.etsy.com/");

        String title = driver.getTitle();

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(expectedTitle,title);

        System.out.println("expectedTitle = " + expectedTitle + "\n" + "actualTitle = " + title);

        WebElement popupAccept = driver.findElement(By.xpath("//button[@data-gdpr-single-choice-accept='true']"));

        popupAccept.click();

        WebElement logo = driver.findElement(By.xpath("//span[@id='logo']"));

        logo.click();

        String titleAfterClick = driver.getTitle();

        Assert.assertEquals(expectedTitle,titleAfterClick,"Verify title did not change after clicking on logo");

        driver.quit();










    }
}
