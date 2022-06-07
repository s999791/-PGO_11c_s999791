import java.util.Scanner;

public class Address {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    // Default constructor
    public Address() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the country: ");
        this.country = scanner.next();
        System.out.print("Input the city: ");
        this.city = scanner.next();
        System.out.print("Input the street: ");
        this.street = scanner.next();

        System.out.print("Input the house number: ");
        this.house = scanner.nextInt();
        System.out.print("Input the flat number: ");
        this.flat = scanner.nextInt();

    }

    // Parametrized constructor
    public Address(String country, String city, String street, int house, int flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    // Below all the getters and setters for the attributes of this class
    public void setCountry(String country) throws RuntimeException  {
        if(country.equals(""))
            throw new RuntimeException("The country cannot be empty.");
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) throws RuntimeException  {
        if(city.equals(""))
            throw new RuntimeException("The city cannot be empty.");
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getHouse() {
        return house;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public int getFlat() {
        return flat;
    }
}