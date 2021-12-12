package basics.designPatterns.facadePattern.facade;

import basics.designPatterns.facadePattern.data.ProductData;
import basics.designPatterns.facadePattern.service.PricingService;
import basics.designPatterns.facadePattern.service.ProductService;

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
