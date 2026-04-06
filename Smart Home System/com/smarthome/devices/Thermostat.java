package com.smarthome.devices;

public class Thermostat extends SmartDevice {
    private double temperature;

    public Thermostat(String name, double temperature) {
        super(name);
        this.temperature = temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature >= 10 && temperature <= 40) {
            this.temperature = temperature;
            System.out.println(name + " temperature set to " + temperature + "°C");
        } else {
            System.out.println("Invalid temperature! Must be between 10 and 40.");
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Thermostat: " + name + " | Status: " + getStatus() + " | Temperature: " + temperature + "°C");
    }
}