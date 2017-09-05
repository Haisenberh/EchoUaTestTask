import Helpers.TestBase;
import org.testng.annotations.Test;

@Test
public class BuyTicketsTest extends TestBase {

    @Test
    public void addItemsToCartTest() {
        TestBase
        .openHomePage()
        .clickBuyF1TicketButton()
        .clickAddToCartOnTicketItemButton()
        .clickContinueShoppingLink()
        .clickAddToCartOnTicketItemButton()
        .clickCheckoutButton()
        .increaseTicketQuantity()
        .increaseTicketQuantity()
        .clickOrderButton()
        .clickNextButton()
        .enterEmailField("andriyhembar@gmail.com")
        .enterPasswordField("justPassword")
        .clickSignInPage(); //can't login via real email and password, bug
    }
}
