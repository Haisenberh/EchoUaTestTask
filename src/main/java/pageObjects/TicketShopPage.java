package pageObjects;

import Helpers.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketShopPage {

    @FindBy(css = "$$(.gom_btn_primary)")
    WebElement addToCartButtonList;

    @FindBy(xpath = "//*[contains(text(), 'ADD TO CART')]")
    WebElement addToCartButton;

    public CartPopUp clickAddToCartOnTicketItemButton() {
        addToCartButton.click();
        return PageFactory.initElements(BrowserFactory.getWebDriver(), CartPopUp.class);
    }
}
