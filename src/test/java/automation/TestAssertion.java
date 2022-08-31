package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertion {

    ChromeDriver driver;

    @Test
    public void TestAssertion(){

        String ChromePath = "resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromePath);
        driver = new ChromeDriver();
        driver.navigate().to("http://google.com");

        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
        driver.close();

    }
}
