package com.smarthome.main;
import com.smarthome.devices.*;
import com.smarthome.system.SmartHome;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartHome home = new SmartHome();

        while (true) {
            System.out.println("\n===== SMART HOME SYSTEM =====");
            System.out.println("1. Add Device");
            System.out.println("2. Turn ON Device");
            System.out.println("3. Turn OFF Device");
            System.out.println("4. Show All Devices");
            System.out.println("5. Set Brightness (Light)");
            System.out.println("6. Set Speed (Fan)");
            System.out.println("7. Set Temperature (Thermostat)");
            System.out.println("8. Start Recording (Camera)");
            System.out.println("9. Stop Recording (Camera)");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nSelect Device Type:");
                    System.out.println("1. Light");
                    System.out.println("2. Fan");
                    System.out.println("3. Thermostat");
                    System.out.println("4. Security Camera");
                    System.out.print("Enter choice: ");

                    int type;
                    try {
                        type = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                        continue;
                    }

                    System.out.print("Enter device name: ");
                    String name = sc.nextLine();

                    switch (type) {
                        case 1:
                            home.addDevice(new Light(name, 50));
                            break;
                        case 2:
                            home.addDevice(new Fan(name, 3));
                            break;
                        case 3:
                            home.addDevice(new Thermostat(name, 24));
                            break;
                        case 4:
                            home.addDevice(new SecurityCamera(name));
                            break;
                        default:
                            System.out.println("Invalid device type!");
                    }
                    break;

                case 2:
                    System.out.print("Enter device name to turn ON: ");
                    String onName = sc.nextLine();
                    SmartDevice onDevice = home.findDevice(onName);
                    if (onDevice != null) {
                        onDevice.turnOn();
                    } else {
                        System.out.println("Device not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter device name to turn OFF: ");
                    String offName = sc.nextLine();
                    SmartDevice offDevice = home.findDevice(offName);
                    if (offDevice != null) {
                        offDevice.turnOff();
                    } else {
                        System.out.println("Device not found!");
                    }
                    break;

                case 4:
                    home.showAllDevices();
                    break;

                case 5:
                    System.out.print("Enter light name: ");
                    String lightName = sc.nextLine();
                    SmartDevice lightDevice = home.findDevice(lightName);
                    if (lightDevice instanceof Light) {
                        System.out.print("Enter brightness (0-100): ");
                        try {
                            int brightness = Integer.parseInt(sc.nextLine());
                            ((Light) lightDevice).setBrightness(brightness);
                        } catch (Exception e) {
                            System.out.println("Invalid brightness!");
                        }
                    } else {
                        System.out.println("Light not found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter fan name: ");
                    String fanName = sc.nextLine();
                    SmartDevice fanDevice = home.findDevice(fanName);
                    if (fanDevice instanceof Fan) {
                        System.out.print("Enter speed (1-5): ");
                        try {
                            int speed = Integer.parseInt(sc.nextLine());
                            ((Fan) fanDevice).setSpeed(speed);
                        } catch (Exception e) {
                            System.out.println("Invalid speed!");
                        }
                    } else {
                        System.out.println("Fan not found!");
                    }
                    break;

                case 7:
                    System.out.print("Enter thermostat name: ");
                    String thermoName = sc.nextLine();
                    SmartDevice thermoDevice = home.findDevice(thermoName);
                    if (thermoDevice instanceof Thermostat) {
                        System.out.print("Enter temperature (10-40): ");
                        try {
                            double temp = Double.parseDouble(sc.nextLine());
                            ((Thermostat) thermoDevice).setTemperature(temp);
                        } catch (Exception e) {
                            System.out.println("Invalid temperature!");
                        }
                    } else {
                        System.out.println("Thermostat not found!");
                    }
                    break;

                case 8:
                    System.out.print("Enter camera name: ");
                    String camStart = sc.nextLine();
                    SmartDevice cam1 = home.findDevice(camStart);
                    if (cam1 instanceof SecurityCamera) {
                        ((SecurityCamera) cam1).startRecording();
                    } else {
                        System.out.println("Camera not found!");
                    }
                    break;

                case 9:
                    System.out.print("Enter camera name: ");
                    String camStop = sc.nextLine();
                    SmartDevice cam2 = home.findDevice(camStop);
                    if (cam2 instanceof SecurityCamera) {
                        ((SecurityCamera) cam2).stopRecording();
                    } else {
                        System.out.println("Camera not found!");
                    }
                    break;

                case 10:
                    System.out.println("Exiting Smart Home System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}