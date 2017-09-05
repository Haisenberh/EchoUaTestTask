package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterGroups;

public class BrowserFactory {

    private static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url) {
        if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            System.out.println("Starting new firefox driver");
        } else if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            System.out.println("Starting new chrome driver");
        } else if (browserName.equalsIgnoreCase("IE")) {
            driver = new ChromeDriver();
            System.out.println("Starting new IE driver");
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    public static WebDriver getWebDriver(){
        return driver;
    }

    @AfterGroups
    public static void closeWebDriver() {
        System.out.println("Closing driver ");
        if (driver != null) {
            driver.quit();
        } else
            System.out.println("null error at close()");
    }
}