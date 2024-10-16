package org.example;

import org.example.vehicle.IVehicle;

public abstract class Transport {
    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }
    protected abstract IVehicle createTransport();
}
