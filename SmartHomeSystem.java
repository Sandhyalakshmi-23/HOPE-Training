import java.util.ArrayList;

abstract class SmartDevice {
    private String name;
    private boolean status;

    public SmartDevice(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Device name cannot be empty");
        }
        this.name = name;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public abstract void showDetails();
}

class Light extends SmartDevice {
    private int brightness;

    public Light(String name, int brightness) {
        super(name);
        setBrightness(brightness);
    }

    public void setBrightness(int brightness) {
        if (brightness < 0 || brightness > 100) {
            throw new IllegalArgumentException("Brightness must be between 0 and 100");
        }
        this.brightness = brightness;
    }

    @Override
    public void showDetails() {
        System.out.println("Light - Name: " + getName() +
                ", Status: " + (getStatus() ? "ON" : "OFF") +
                ", Brightness: " + brightness);
    }
}

class Fan extends SmartDevice {
    private int speed;

    public Fan(String name, int speed) {
        super(name);
        setSpeed(speed);
    }

    public void setSpeed(int speed) {
        if (speed < 1 || speed > 5) {
            throw new IllegalArgumentException("Fan speed must be between 1 and 5");
        }
        this.speed = speed;
    }

    @Override
    public void showDetails() {
        System.out.println("Fan - Name: " + getName() +
                ", Status: " + (getStatus() ? "ON" : "OFF") +
                ", Speed: " + speed);
    }
}

class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(String name, int temperature) {
        super(name);
        setTemperature(temperature);
    }

    public void setTemperature(int temperature) {
        if (temperature < 16 || temperature > 30) {
            throw new IllegalArgumentException("Temperature must be between 16 and 30");
        }
        this.temperature = temperature;
    }

    @Override
    public void showDetails() {
        System.out.println("Thermostat - Name: " + getName() +
                ", Status: " + (getStatus() ? "ON" : "OFF") +
                ", Temperature: " + temperature);
    }
}

class SecurityCamera extends SmartDevice {
    private boolean recording;

    public SecurityCamera(String name, boolean recording) {
        super(name);
        this.recording = recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    @Override
    public void showDetails() {
        System.out.println("Security Camera - Name: " + getName() +
                ", Status: " + (getStatus() ? "ON" : "OFF") +
                ", Recording: " + (recording ? "YES" : "NO"));
    }
}

class SmartHome {
    private ArrayList<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void showAllDevices() {
        if (devices.isEmpty()) {
            System.out.println("No devices added.");
            return;
        }

        for (SmartDevice device : devices) {
            device.showDetails();
        }
    }
}

public class SmartHomeSystem{
    public static void main(String[] args) {
        SmartHome home = new SmartHome();

        try {
            Light light = new Light("Living Room Light", 80);
            Fan fan = new Fan("Bedroom Fan", 3);
            Thermostat thermostat = new Thermostat("Hall Thermostat", 24);
            SecurityCamera camera = new SecurityCamera("Front Door Camera", true);

            light.turnOn();
            fan.turnOn();
            thermostat.turnOff();
            camera.turnOn();

            home.addDevice(light);
            home.addDevice(fan);
            home.addDevice(thermostat);
            home.addDevice(camera);

            home.showAllDevices();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}