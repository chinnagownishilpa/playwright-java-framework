package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

    private Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    private final String cartIcon =
            ".shopping_cart_link";

    public void addProduct(String productName){

        Locator product =
                page.locator(".inventory_item")
                        .filter(
                                new Locator.FilterOptions()
                                        .setHasText(productName));

        product.getByRole(
                        AriaRole.BUTTON)
                .click();
    }

    public void openCart() {
        page.locator(cartIcon).click();
    }

}