import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator = new By.ByCssSelector("input[type=text]");
    By submitButtonLocator = new By.ByCssSelector(".qjixn8-0.sc-1bydi5r-0.gaMakD");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        sendKeys(searchBoxLocator, text);
        click(submitButtonLocator);
    }
}
