package org.example;

import org.example.vehicle.Car;
import org.example.vehicle.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
