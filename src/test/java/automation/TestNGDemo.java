package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGDemo {

    ChromeDriver driver2;

    @Test(groups = {"ali"})
    public void openURL(){
        String ChromePath = "resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromePath);
        driver2 = new ChromeDriver();
        driver2.navigate().to("http://google.com");
    }

    @Test(priority = 1, dependsOnMethods = {"openURL"})
    public void userLogin(){

        System.out.println(driver2.getCurrentUrl());
    }

    @Test(priority = 2, enabled = false, dependsOnMethods = {"openURL"})
    public void userCanBuy(){

        System.out.println(driver2.getTitle());
    }

    @Test(groups = {"ali"}, dependsOnMethods = {"openURL"})
    public void GetAnyThing(){
        System.out.println(driver2.getMouse());
    }

    ////// Test Assertion ///////
    @Test(dependsOnMethods = {"openURL"})
    public void TestAssertion(){
        String title = driver2.getTitle();
        Assert.assertEquals(title, "Google");
        System.out.println("the title is pass");
    }

    @AfterTest
    public void lastTest(){
        driver2.quit();
    }

}
