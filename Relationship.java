class Battery{
    public void power(){
        System.out.println("still have 50% power");
    }
}
class Remote{
    Battery mini=new Battery();
    public void changechannel(){
        mini.power();
        System.out.println("channel changed");
    }
}
public class Relationship{
    public static void main(String[] args){
        Remoter=new Remote();
        r.changechannel();
    }
}

