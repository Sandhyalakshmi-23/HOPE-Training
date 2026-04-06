package com.smarthome.devices;

public abstract class SmartDevice {
    protected String name;
    protected boolean status;

    public SmartDevice(String name) {
        this.name = name;
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println(name + " is turned ON");
    }

    public void turnOff() {
        status = false;
        System.out.println(name + " is turned OFF");
    }

    public String getStatus() {
        return status ? "ON" : "OFF";
    }

    public String getName() {
        return name;
    }

    public abstract void showDetails();
}