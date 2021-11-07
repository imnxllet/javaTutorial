package basics.class6.facadePattern.facade;

import basics.class6.facadePattern.data.ProductData;
import basics.class6.facadePattern.service.PricingService;
import basics.class6.facadePattern.service.ProductService;

public class ProductFacade {
    private ProductService productService;
    private PricingService pricingService;
    private InventoryFacade inventoryFacade;

    public ProductData getProductData(final String productId) {
        ProductData productData = productService.getProductById(productId);
        productData.setPrice(pricingService.getProductPriceById(productId));

        // inventory info
        productData.setStock(inventoryFacade.getStock(productId));


        return productData;
    }
}
