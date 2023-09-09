package com.company;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();

    }

    private void startElectricity() {
        System.out.println("method electricity");
    }

    private void startCommand() {
        System.out.println("method startCommand");
    }

    private void startFuelSystem() {
        System.out.println("method startFuelSystem()");
    }
}
