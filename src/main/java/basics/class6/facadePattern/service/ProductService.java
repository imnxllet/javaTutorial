package basics.class6.facadePattern.service;

import basics.class6.facadePattern.data.ProductData;

public class ProductService {
    public ProductData getProductById(String id) {

        // get product from DB ...

        return new ProductData();
    }
}
