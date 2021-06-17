import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC2_Evelin {

 WebDriver driver;

 @Test
    public void getDriver() throws InterruptedException {

     WebDriverManager.chromedriver().setup();

   driver =  new ChromeDriver();

     driver.navigate().to("https://www.etsy.com/");
 }
 @Test
 public void input(){

  WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
  searchBox.sendKeys("dada atolye");

 }

}
