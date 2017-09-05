package pageObjects;

import Helpers.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPopUp {

    @FindBy(xpath = "//*[contains(text(), 'Checkout')]")
    WebElement checkoutButton;

    @FindBy(xpath = "//*[contains(text(), 'Continue Shopping')]")
    WebElement continueShoppingLink;

    public TicketShopPage clickContinueShoppingLink() {
        continueShoppingLink.click();
        return PageFactory.initElements(BrowserFactory.getWebDriver(), TicketShopPage.class);
    }

    public MyCartPage clickCheckoutButton() {
        checkoutButton.click();
        return PageFactory.initElements(BrowserFactory.getWebDriver(), MyCartPage.class);
    }
}
