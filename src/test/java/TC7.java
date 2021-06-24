import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC7 {
    WebDriver driver;

    @BeforeMethod
    public void methodStart(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void filterTest() throws InterruptedException {

        driver.get("https://www.etsy.com/");
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("bohem");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[.='bohemian sandals']")).click();
        driver.findElement(By.id("search-filter-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[contains(text(),'FREE shipping')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
        Thread.sleep(2000);
        WebElement searchResultElement = driver.findElement(By.cssSelector(".wt-display-inline-flex-sm>span:nth-of-type(1)"));
        String searchResult = searchResultElement.getText().split(" ")[0].replace(",","");
        System.out.println("search result = " + searchResult);
        int searchResultInt = Integer.parseInt(searchResult);
        boolean isSearchResMoreThan1000 = searchResultInt>1000;
        Assert.assertTrue(isSearchResMoreThan1000);
    }
}
