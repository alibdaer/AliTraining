package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriveDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");

        WebDriver chrome = new ChromeDriver();
        chrome.navigate().to("http://google.com");
        Thread.sleep(5000);
        chrome.quit();

    }
}
