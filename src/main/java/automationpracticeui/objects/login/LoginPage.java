package automationpracticeui.objects.login;

import automationpracticeui.objects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MainPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    private WebElement emailAddressRegistrationInput;

    @FindBy(id = "SubmitCreate")
    private WebElement emailAddressRegistrationButton;

    @FindBy(id = "email")
    private WebElement emailLoginInput;

    @FindBy(id = "passwd")
    private WebElement passwordLoginInput;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLoginButton;

    public WebElement getEmailAddressRegistrationInput() {
        return emailAddressRegistrationInput;
    }

    public WebElement getEmailAddressRegistrationButton() {
        return emailAddressRegistrationButton;
    }

    public WebElement getEmailLoginInput() {
        return emailLoginInput;
    }

    public WebElement getPasswordLoginInput() {
        return passwordLoginInput;
    }

    public WebElement getSubmitLoginButton() {
        return submitLoginButton;
    }
}
