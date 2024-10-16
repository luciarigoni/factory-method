package org.example.vehicle;

public class Bicycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o transporte...");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a comida!");
    }
}
