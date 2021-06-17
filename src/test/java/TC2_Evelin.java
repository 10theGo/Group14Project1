import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

  WebElement popup = driver.findElement(By.xpath("//*[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
    popup.click();

     WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();

     WebElement checkMsg = driver.findElement(By.xpath("//*[@class='wt-pb-xs-2 has-inline-links']"));
        System.out.println("checkMsg.getText() = " + checkMsg.getText());
        String checkMSg = checkMsg.getText();
        String expectedResult= "¿Querías decir dadaatolye?";
         System.out.println("expectedResult = " + expectedResult);

     Assert.assertEquals(checkMsg,expectedResult, "verify Check message");


 }


}
