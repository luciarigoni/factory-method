package org.example;

import org.example.vehicle.Bicycle;
import org.example.vehicle.IVehicle;

public class BicycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
