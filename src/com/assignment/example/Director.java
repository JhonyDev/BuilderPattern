package com.assignment.example;

import com.assignment.example.builders.Builder;
import com.assignment.example.enums.Transmission;
import com.assignment.example.enums.Type;
import com.assignment.example.parts.Engine;
import com.assignment.example.parts.GPSNavigator;
import com.assignment.example.parts.TripComputer;

public class Director {
    public void makeSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructHyperCar(Builder builder) {
        builder.setType(Type.HYPER_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(9.8, 1));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTripComputer(new TripComputer());
    }

    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
