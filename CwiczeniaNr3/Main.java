package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // Najpierw tworzymy magazyny
        Storage warszawa = new Storage(1);
        Storage krakow = new Storage(2);

        // Tworzymy kilka produtków: niektóre są w magazynie, inne nie
        Product detka = new Product("Dętka", ProductType.Entertainment, 50, 10);
        detka.setStorage(warszawa);
        Product opona = new Product("Opona", ProductType.Entertainment, 100, 20);
        opona.setStorage(warszawa);
        Product kask = new Product("Kask", ProductType.Entertainment, 300, 5);
        kask.setStorage(krakow);
        Product garmin = new Product("Garmin", ProductType.Electronic, 500, 1);
        Product batonik = new Product("Batonik", ProductType.Consumable, 5, 100);

        // Tworzymy użytkowników
        Person adam = new Person("Adam", "Adamowski", 200, 2000);
        Person ewa = new Person("Ewa", "Adamowska", 10, 10);

        // Użytkownik adam tworzy nowy koszyk i dodaje do niego kilka rzeczy
        adam.MakeOrder();
        adam.AddItemToCart(batonik);
        adam.AddItemToCart(detka);

        // Wydrukujemy dla sprawdzenia wartość koszyka i czas realizacji
        System.out.println("Całkowity czas realizacji: " + adam.getCurrentShoppingCart().getTotalDeliveryTime());
        System.out.println("Wartość produktów w koszyku: " + adam.getCurrentShoppingCart().getTotalPrice());

        // Użytkownik adam płaci za zamówienie kartą
        adam.BuyByCard();

        // Użytkownik ewa próbuje złożyć zamówienie bez utworzenia koszyka
        ewa.BuyByCard();

        // Użytkownik ewa tworzy nowy koszyk i dodaje do niego kilka rzeczy
        ewa.MakeOrder();
        ewa.AddItemToCart(garmin);

        // Użytkownik ewa płaci za zamówienie gotówką (nie ma wystarczająco pieniędzy)
        ewa.BuyInCash();

        // Użytkownik ewa bierze pożyczkę
        ewa.setMoneyInCash(1000);

        // Użytkownik ewa ponownie próbuje zapłacić
        ewa.BuyInCash();

        // Użytkownik adam próbuje kupić rzecz, którą właśnie kupiła ewa i nie ma więcej na stanie
        adam.MakeOrder();
        adam.AddItemToCart(garmin);
        adam.BuyByCard();

        // Sklep uzupełnia stany magazynowe
        garmin.IncreaseQuantity(5);

        // Adam ponownie próbuje dokonać zakupu
        adam.BuyByCard();

        // Drukujemy historie zamówień użytkownika adam
        for (int i = 0; i < adam.getPastShoppingCarts().size(); i++) {
            adam.getPastShoppingCarts().get(i).PrintProducts();
        }
    }
}
