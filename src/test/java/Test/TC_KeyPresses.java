package Test;

import Pages.BasePage;
import Pages.HomePage;
import Pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TC_KeyPresses extends BasePage {

    @Test
    public void testBackSpace() {
        KeyPressesPage keyPressesPage = new KeyPressesPage(driver);
        keyPressesPage.PressBtn();
        keyPressesPage.EnteredText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.TextResult(),"You entered: BACK_SPACE","Error not the same expected");
    }
    @Test
    public void testPi(){
        KeyPressesPage keyPressesPage = new KeyPressesPage(driver);
        keyPressesPage.enterPi();
    }
}
