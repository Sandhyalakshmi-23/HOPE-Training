package com.smarthome.devices;

public class Light extends SmartDevice {
    private int brightness;

    public Light(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
            System.out.println(name + " brightness set to " + brightness + "%");
        } else {
            System.out.println("Invalid brightness! Must be between 0 and 100.");
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Light: " + name + " | Status: " + getStatus() + " | Brightness: " + brightness + "%");
    }
}