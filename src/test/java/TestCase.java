import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestCase extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductsFavoritePage productsFavoritePage;
    LoginPage loginPage;


    @Test
    @Order(1)
    public void homePageControl()  {
        Assertions.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi", driver.getTitle(),
                "Not on homepage!");
    }

    @Test
    @Order(2)
    public void loginPage() {
        homePage = new HomePage(driver);
        homePage.goTologinPage();
       // Assertions.assertTrue(loginPage.isOnLoginPage());
        Assertions.assertEquals("Üye Girişi - GittiGidiyor", driver.getTitle(),
                "Not on login page!");
    }


    @Test
    @Order(3)
    public void SignIn()  {
        loginPage = new LoginPage(driver);
        loginPage.login();
    }

    @Test
    @Order(4)
    public void searchProduct(){
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("samsung");
        Assertions.assertTrue(productsPage.isOnProductsPage(), "Not on products page!");
    }

    @Test
    @Order(5)
    public void AddToFavorites(){
        productsPage.addProductFavorite(1);
    }

    @Test
    @Order(6)
    public void goToFavoritesPage(){
        productsFavoritePage = new ProductsFavoritePage(driver);
        homePage.goToFavoritePage();
        Assertions.assertTrue(productsFavoritePage.isOnProductsFavoritePage(),"Not on favorite products page!");
    }

    @Test
    @Order(7)
    public void checkFavoriteProduct(){
        Assertions.assertTrue(productsFavoritePage.isFavoriteProductsCountUp(),
                "Favorite products count did not increase!");
    }

    @Test
    @Order(8)
    public void DeleteProduct(){
        productsFavoritePage.deleteFavoriteProducts();
        Assertions.assertTrue(productsFavoritePage.isFavoriteProductsCountEmpty(),"Favorite products not empty!");
    }

    @Test
    @Order(9)
    public void logOut(){
        homePage.loginOut();
    }

}
