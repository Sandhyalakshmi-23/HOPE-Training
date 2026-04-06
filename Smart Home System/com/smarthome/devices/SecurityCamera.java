package com.smarthome.devices;

public class SecurityCamera extends SmartDevice {
    private boolean recording;

    public SecurityCamera(String name) {
        super(name);
        this.recording = false;
    }

    public void startRecording() {
        if (status) {
            recording = true;
            System.out.println(name + " started recording.");
        } else {
            System.out.println(name + " is OFF. Turn it on first.");
        }
    }

    public void stopRecording() {
        recording = false;
        System.out.println(name + " stopped recording.");
    }

    @Override
    public void showDetails() {
        System.out.println("Security Camera: " + name + " | Status: " + getStatus() + " | Recording: " + (recording ? "Yes" : "No"));
    }
}