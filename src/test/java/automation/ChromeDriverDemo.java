package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

    public static void main(String[] args) {

        String ChromePath = "resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromePath);
        ChromeDriver driver2 = new ChromeDriver();
        driver2.navigate().to("http://google.com");

    }
}
