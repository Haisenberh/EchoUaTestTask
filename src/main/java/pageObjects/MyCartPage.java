package pageObjects;
import Helpers.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {

    @FindBy(css = "$$(.fa fa-plus-circle)")
    WebElement increaseTicketQuantityButton;

    @FindBy(xpath = "//*[contains(text(), 'Order')]")
    WebElement orderButton;

    public MyCartPage increaseTicketQuantity() {
        increaseTicketQuantityButton.click();
        return this;
    }

    public RecommendedTicketPage clickOrderButton() {
        orderButton.click();
        return PageFactory.initElements(BrowserFactory.getWebDriver(), RecommendedTicketPage.class);
    }
}
