import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{

    By loginLocator = By.xpath("(//div[contains(@class, 'gekhq4-4 egoSnI')])[1]");
    WebElement loginLocator2 = driver.findElement(By.xpath("(//div[contains(@class, 'gekhq4-4 egoSnI')])[1]"));
    By myFavoritesLocator = new By.ByCssSelector("a[title=Favorilerim]");
    By loginButtonLocator = new By.ByCssSelector(".sc-12t95ss-3.fDarBX");
    By loginOutLocator = By.xpath("//a[text()=\"Çıkış\"]");
    SearchBox searchBox;
    Actions actions = new Actions(driver);


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public void goTologinPage() {
        waitMethod(loginLocator);
        actions.moveToElement(loginLocator2).perform();
        waitMethod(loginButtonLocator);
        click(loginButtonLocator);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public void goToFavoritePage() {
        actions.moveToElement(driver.findElement(By.xpath("(//div[@class='gekhq4-4 fWiwPC'])[1]"))).perform();
        waitMethod(myFavoritesLocator);
        click(myFavoritesLocator);
    }

    public void loginOut() {
        actions.moveToElement(driver.findElement(By.cssSelector("a[title=Hesabım]"))).perform();
        waitMethod(loginOutLocator);
        click(loginOutLocator);
    }

}
