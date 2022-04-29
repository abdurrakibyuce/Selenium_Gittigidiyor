import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By emailLocator = By.id("L-UserNameField");
    By passwordLocator = By.id("L-PasswordField");
    By loginButton = By.id("gg-login-enter");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnLoginPage() {
        return isDisplayed(loginButton);
    }

    public void login() {
        waitMethod(emailLocator);
        sendKeys(emailLocator,"emailname@gmail.com");
        waitMethod(passwordLocator);
        sendKeys(passwordLocator,"password");
        click(loginButton);
    }

}
