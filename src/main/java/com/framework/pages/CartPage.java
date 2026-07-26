package com.framework.pages;

import com.microsoft.playwright.Page;

public class CartPage {

    private Page page;

    public CartPage(Page page){
        this.page = page;
    }

    public boolean isProductDisplayed(String productName){

        return page.locator(".inventory_item_name")
                .filter(
                        new com.microsoft.playwright.Locator.FilterOptions()
                                .setHasText(productName))
                .isVisible();

    }

}