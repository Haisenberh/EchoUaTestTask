package pageObjects;

import Helpers.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommendedTicketPage {
    @FindBy(css = ".goo_btn-next")
    WebElement nextButton;

    public IdentificationPage clickNextButton() {
        nextButton.click();
        return PageFactory.initElements(BrowserFactory.getWebDriver(), IdentificationPage.class);
    }
}
