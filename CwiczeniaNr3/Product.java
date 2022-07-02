package com.company;

public class Product {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Storage storage;
    private boolean isAvailable;

    public Product(String name, ProductType productType, double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;

        if (this.quantity > 0) {
            this.isAvailable = true;
        }
    }

    public boolean Sell() {
        if (quantity > 0) {
            this.quantity--;
            return true;
        } else {
            System.out.println("Nie można sprzedać, brakuje produktu");
            return false;
        }
    }

    public void IncreaseQuantity(int number) {
        this.quantity += number;
    }


    public int GetDeliveryTime() {
        if (storage != null) {
            return storage.getDeliveryTime();
        }
        else {
            return 0;
        }
    }



    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
