package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

    ChromeDriver driver2;

    @BeforeTest
    public void openURL(){
        String ChromePath = "resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromePath);
        driver2 = new ChromeDriver();
        driver2.navigate().to("http://google.com");
    }

    @Test
    public void userLogin(){

        System.out.println(driver2.getCurrentUrl());
    }

    @Test
    public void userCanBuy(){

        System.out.println(driver2.getTitle());
    }

    @AfterTest
    public void lastTest(){
        driver2.quit();
    }

}
