package org.example;

import org.example.vehicle.IVehicle;
import org.example.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
