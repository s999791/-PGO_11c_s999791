package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentShoppingCart;
    private List<ShoppingCart> pastShoppingCarts = new ArrayList<ShoppingCart>();


    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
    }

    public void MakeOrder() {
        currentShoppingCart = new ShoppingCart();
    }

    public void AddItemToCart(Product product) {
        if (currentShoppingCart == null) {
            System.out.println("Nie masz istniejącego koszyka");
            return;
        }

        this.getCurrentShoppingCart().products.add(product);
    }

    public void BuyByCard() {
        if (currentShoppingCart == null) {
            System.out.println("Nie masz istniejącego koszyka");
            return;
        }

        if (this.moneyOnCard >= this.getCurrentShoppingCart().getTotalPrice()) {
            if (currentShoppingCart.Sell()) {
                pastShoppingCarts.add(this.getCurrentShoppingCart());
                currentShoppingCart = null;
                System.out.println("Poprawnie złożono zamówienie");
            }
        } else {
            System.out.println("Brak środków na karcie");
        }
    }

    public void BuyInCash() {
        if (currentShoppingCart == null) {
            System.out.println("Nie masz istniejącego koszyka");
            return;
        }

        if (this.moneyInCash >= this.getCurrentShoppingCart().getTotalPrice()) {
            currentShoppingCart.Sell();
            pastShoppingCarts.add(this.getCurrentShoppingCart());
            currentShoppingCart = null;
            System.out.println("Poprawnie złożono zamówienie");
        } else {
            System.out.println("Brak środków na karcie");
        }
    }



    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }
    public void setMoneyInCash(double moneyInCash) {
        this.moneyInCash = moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }
    public void setMoneyOnCard(double moneyOnCard) {
        this.moneyOnCard = moneyOnCard;
    }

    public ShoppingCart getCurrentShoppingCart() {
        return currentShoppingCart;
    }

    public List<ShoppingCart> getPastShoppingCarts() {
        return pastShoppingCarts;
    }
}
