import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductsPage extends BasePage{

    By searchResultNameLocator = new By.ByCssSelector(".m96g9g-1.gKNIBK");
    By productsFavoriteİconLocator = new By.ByCssSelector(".likeIcon");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage() {
        return isDisplayed(searchResultNameLocator);
    }

    public void addProductFavorite(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts (){
        return findAll(productsFavoriteİconLocator);
    }
}
