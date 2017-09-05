package Helpers;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import pageObjects.HomePage;

import java.util.ResourceBundle;

public abstract class TestBase {

    private static String baseUrl, browser;

    //Parse config data from config.properties file
    private static ResourceBundle config = ResourceBundle.getBundle("config");

    @BeforeGroups
    public static HomePage openHomePage() {
        baseUrl = config.getString("baseUrl");
        browser = config.getString("defaultBrowser");

        HomePage page = PageFactory.initElements(BrowserFactory.startBrowser(browser, baseUrl), HomePage.class);
        return page;
    }

    @AfterGroups
    public void CloseBrowser() {
        BrowserFactory.closeWebDriver();
    }
}
