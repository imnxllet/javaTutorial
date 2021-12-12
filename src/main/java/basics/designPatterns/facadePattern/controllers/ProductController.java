package basics.designPatterns.facadePattern.controllers;

import basics.designPatterns.facadePattern.facade.ProductFacade;

public class ProductController {
    private ProductFacade productFacade;
    public void getProductInfo() {
        System.out.println(productFacade.getProductData("1001000100"));
    }
}
