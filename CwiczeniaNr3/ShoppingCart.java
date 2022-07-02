package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShoppingCart {
    private String id = UUID.randomUUID().toString();

    public List<Product> products = new ArrayList<Product>();

    public boolean Sell() {
        boolean success = true;
        for (int i = 0; i < products.size(); i++) {
            if (!products.get(i).Sell())
            success = false;
            return success;
        }
        return success;
    }


    public double getTotalPrice() {
        double price = 0;
        for (int i = 0; i < products.size(); i++) {
           price += products.get(i).getPrice();
        }

        return price;
    }

    public int getTotalDeliveryTime() {
        int deliveryTime = 0;
        for (int i = 0; i < products.size(); i++) {
            deliveryTime += products.get(i).GetDeliveryTime();
        }

        return deliveryTime;
    }

    public void PrintProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getName());
        }
    }
}
