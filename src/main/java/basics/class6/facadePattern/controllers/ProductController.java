package basics.class6.facadePattern.controllers;

import basics.class6.facadePattern.facade.ProductFacade;

public class ProductController {
    private ProductFacade productFacade;
    public void getProductInfo() {
        System.out.println(productFacade.getProductData("1001000100"));
    }
}
