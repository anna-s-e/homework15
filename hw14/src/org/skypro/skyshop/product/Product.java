package org.skypro.skyshop.product;

public class Product {
    private String productName;
    private int priceOfProduct;

    public Product(String productName, int priceOfProduct) {
        this.productName = productName;
        this.priceOfProduct = priceOfProduct;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getPriceOfProduct() {
        return this.priceOfProduct;
    }
}
