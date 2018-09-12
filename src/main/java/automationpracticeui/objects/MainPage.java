package automationpracticeui.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id = "search_query_top")
    private WebElement searchInput;

    @FindBy(className = "login")
    private WebElement signinButton;

    @FindBy(name = "submit_search")
    private WebElement searchSubmitButton;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchSubmitButton() {
        return searchSubmitButton;
    }
}
