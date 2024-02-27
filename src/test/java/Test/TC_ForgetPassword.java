package Test;

import Pages.BasePage;
import Pages.ForgetPasswordPage;
import org.testng.annotations.Test;

public class TC_ForgetPassword extends BasePage {

    @Test
    public void Tc1_validRetrieve(){
        ForgetPasswordPage PasswordObj=new ForgetPasswordPage(driver);
        PasswordObj.SetForgetBtn();
        PasswordObj.SetEmail("AAAAA@gmail.com");
        PasswordObj.SubmitBtn();
    }
}
