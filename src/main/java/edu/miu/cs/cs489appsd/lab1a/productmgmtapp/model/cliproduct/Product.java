package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.cliproduct;

public class Product {
    private String productId;
    private String productName;
    private double unitPrice;
    private int quantity;

    // Default constructor
    public Product() {
        this.productId = "";
        this.productName = "";
        this.unitPrice = 0.0;
        this.quantity = 0;
    }

    // Parameterized constructor
    public Product(String productId, String productName, double unitPrice, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // Copy constructor
    public Product(Product other) {
        this.productId = other.productId;
        this.productName = other.productName;
        this.unitPrice = other.unitPrice;
        this.quantity = other.quantity;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
    }
}
