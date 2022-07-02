package com.company;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private int deliveryTime;
    private List<Product> products = new ArrayList<Product>();

    public Storage(int deliveryTime) {
        if (deliveryTime < 0) {
            deliveryTime = 1;
        }
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
}
