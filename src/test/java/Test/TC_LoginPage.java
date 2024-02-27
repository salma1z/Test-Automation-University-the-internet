package Test;

import Pages.BasePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TC_LoginPage extends BasePage {

    @Test
    public void TC_ValidLogin() throws InterruptedException {
        LoginPage LoginObj = new LoginPage(driver);
        LoginObj.LoginForm();
        LoginObj.SetName("tomsmith");
        LoginObj.SetPassword("SuperSecretPassword!");
        LoginObj.SetLogin();
        String successMsg=LoginObj.SetFlashMsg();
        assertTrue(successMsg.contains("You logged into a secure area!"), "You logged in successfully");
        Thread.sleep(2000);
    }
    }
