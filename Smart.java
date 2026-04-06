abstract class Smartdevice{
    abstract void turnOn();
    abstract void turnOff();
    void deviceInfo(){
        System.out.println("It is a device");
    }

}
interface Remote{
    void change();
}

class TV implements Remote{
    public void change(){
        System.out.println("change channel");
    }
}
class Light extends Smartdevice{

    void turnOn(){
        System.out.println("Light on");
    }

    void turnOff(){
        System.out.println("Light off");
    }
}
public class Smart{
    public static void main(String[] args){
        Smartdevice d=new Light();
        d.turnOn();
        d.deviceInfo();
    }
}