import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC3_Omer {

    WebDriver driver;

    @Test
    public void getDRIVER(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

    }

}

//TC #3: etsy.com Verification – Section 3
//
//1. Open Chrome browser
//2. Go to https://www.etsy.com/
//3. Click Jewelry & Accessories module
//4. Print total result.
//5. Go back.
//6. Print total result in all categories. ( All categories (65,443,161 results, with Ads Learn more))
//7. Verify that all categories result is bigger than Jewelry & Accesories page.