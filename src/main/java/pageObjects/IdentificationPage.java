package pageObjects;

import Helpers.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdentificationPage {

    @FindBy(id = "email")
    WebElement emailAddressField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//*[contains(text(), 'Sign In')]")
    WebElement signInButton;

    public IdentificationPage enterEmailField(String email){
        emailAddressField.sendKeys(email);
        return this;
    }

    public IdentificationPage enterPasswordField(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public TicketShopPage clickSignInPage() {
        signInButton.click();
        return PageFactory.initElements(BrowserFactory.getWebDriver(), TicketShopPage.class);
    }
}
