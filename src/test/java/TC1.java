import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void Test1(){
        driver.get("https://www.etsy.com");

        String expectedResult= "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualResult = driver.getTitle();

        Assert.assertEquals(expectedResult,actualResult,"verify page title");
    }


}


  /*  TC1: etsy.com Verification – Section 1
  1. Open Chrome browser
2. Go to https://www.etsy.com/
3. Verify the web page title is “Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"
4. Click to Etsy logo top left of the site.
5. Verify page title is not changed
*/