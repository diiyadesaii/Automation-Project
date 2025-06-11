package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utility.Config;

import java.io.IOException;
import java.time.Duration;

public class Base {
    public WebDriver driver;

    @BeforeClass

    public void setup() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito"); // Opens Chrome in incognito mode
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Config.loadProperties();
        driver.get(Config.getProperties("url"));
    }

    @AfterClass
    public void terminate() {
        if (driver != null) {
            driver.quit();
        }
    }
    }


