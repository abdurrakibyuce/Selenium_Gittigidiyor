import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsFavoritePage extends BasePage{

    By favoritePageControlLocator = By.className("robot-watchproducts-title");
    By productsCount = By.className("watch-products--pagination-info");
    By selectAllProducts =By.className("robot-watchproducts-select-all");
    By deleteProducts = By.className("robot-delete-all-button");
    By emptyİcon = By.className("no-results-icon");

    public ProductsFavoritePage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsFavoritePage() {
         return isDisplayed(favoritePageControlLocator);
    }

    public boolean isFavoriteProductsCountUp() {
       return isDisplayed(productsCount);
    }

    public void deleteFavoriteProducts() {
        click(selectAllProducts);
        click(deleteProducts);
    }

    public boolean isFavoriteProductsCountEmpty() {
        return isDisplayed(emptyİcon);
    }

}
