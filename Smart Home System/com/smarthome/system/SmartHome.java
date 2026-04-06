package com.smarthome.system;

import com.smarthome.devices.*;
import java.util.ArrayList;

public class SmartHome {
    private ArrayList<SmartDevice> devices;

    public SmartHome() {
        devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println(device.getName() + " added to Smart Home System.");
    }

    public void showAllDevices() {
        if (devices.isEmpty()) {
            System.out.println("No devices added.");
            return;
        }

        System.out.println("\n--- Smart Home Devices ---");
        for (SmartDevice device : devices) {
            device.showDetails();
        }
    }

    public SmartDevice findDevice(String name) {
        for (SmartDevice device : devices) {
            if (device.getName().equalsIgnoreCase(name)) {
                return device;
            }
        }
        return null;
    }
}