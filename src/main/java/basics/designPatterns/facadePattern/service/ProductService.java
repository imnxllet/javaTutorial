package basics.designPatterns.facadePattern.service;

import basics.designPatterns.facadePattern.data.ProductData;

public class ProductService {
    public ProductData getProductById(String id) {

        // get product from DB ...

        return new ProductData();
    }
}
