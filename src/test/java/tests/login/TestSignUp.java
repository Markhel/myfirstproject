package tests.login;

import automationpracticeui.steps.login.LoginPageSteps;
import automationpracticeui.steps.login.SignUpPageSteps;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestSignUp extends BaseTest {

    @Test
    void testSignUp () {
        LoginPageSteps loginPageSteps = mainPageSteps.clickSigninButton();
        SignUpPageSteps signUpPageSteps = loginPageSteps.performEmailRegistration("wefwef@gmail.com");


    }
}
