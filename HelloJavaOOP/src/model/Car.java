package model;

public class Car {
    public String make = "Land Rover";
    public String model = "Range Rover";
    public int modelYear = 2023;
    public String color = "Midnight blue";
    public double price = 100_000.00;

    public String drive() {
        return "Car successfully in drive mode!";
    }

    public String brake() {
        return "Brakes applied successfully!";
    }

    @Override
    public String toString() {
        return make;
    }
}
