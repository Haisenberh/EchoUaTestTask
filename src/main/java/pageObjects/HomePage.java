package pageObjects;

import Helpers.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//*[@id=\"buybtndp\"]/li[1]/a")
    WebElement buyF1Ticket;

    public TicketShopPage clickBuyF1TicketButton() {
        buyF1Ticket.click();
        return PageFactory.initElements(BrowserFactory.getWebDriver(), TicketShopPage.class);
    }
}
