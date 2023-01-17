package org.example.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void OpenBrowser() {
        System.setProperty("webDriver.chrome.driver", "D:\\Testing\\untitled\\src\\main\\resources");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
