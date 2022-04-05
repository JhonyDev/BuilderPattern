package com.assignment.example;

import com.assignment.example.builders.CarBuilder;
import com.assignment.example.builders.CarManualBuilder;
import com.assignment.example.products.Car;
import com.assignment.example.products.Manual;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructHyperCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());
        System.out.println("------------------------------------------------------");

        // Director may know several building recipes.
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructHyperCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}
