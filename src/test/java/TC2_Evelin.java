import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TC2_Evelin {

 WebDriver driver;

 @Test
    public void getDriver() {

     WebDriverManager.chromedriver().setup();

   driver =  new ChromeDriver();

     driver.navigate().to("https://www.etsy.com/");
 }

 @Test
 public void input(){

  WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
  searchBox.sendKeys("dada atolye");

     WebElement popup = driver.findElement(By.xpath("//*[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
     popup.click();

     WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));

     searchButton.click();

     WebElement checkMsg = driver.findElement(By.xpath("//*[@class='wt-pb-xs-2 has-inline-links']"));

     String checkMSg = checkMsg.getText();
     String expectedResult= "¿Querías decir dadaatolye?";

     Assert.assertEquals(checkMsg.getText(),expectedResult, "verify Check message");
     Assert.assertEquals(checkMsg.getText(), expectedResult, "verify Check message");

     driver.quit();
    }
}

