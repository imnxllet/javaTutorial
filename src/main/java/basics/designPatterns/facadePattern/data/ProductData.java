package basics.designPatterns.facadePattern.data;

import java.util.UUID;

public class ProductData {
    private String productName;
    private UUID productId;
    private double price;

    public void setStock(int stock) {
        this.stock = stock;
    }

    private int stock;

    public void setPrice(double price) {
        this.price = price;
    }
}
