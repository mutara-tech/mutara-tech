package main;

import model.Car;

public class App {
    public static void main(String[] args) throws Exception {

        // Object creation
        Car car1 = new Car();
        System.out.println(car1.color);
        System.out.println(car1.drive());
    }
}
