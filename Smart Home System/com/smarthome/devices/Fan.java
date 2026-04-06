package com.smarthome.devices;

public class Fan extends SmartDevice {
    private int speed;

    public Fan(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 5) {
            this.speed = speed;
            System.out.println(name + " speed set to " + speed);
        } else {
            System.out.println("Invalid speed! Must be between 1 and 5.");
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Fan: " + name + " | Status: " + getStatus() + " | Speed: " + speed);
    }
}