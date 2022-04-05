package com.assignment.example.builders;

import com.assignment.example.enums.Transmission;
import com.assignment.example.enums.Type;
import com.assignment.example.parts.Engine;
import com.assignment.example.parts.GPSNavigator;
import com.assignment.example.parts.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
