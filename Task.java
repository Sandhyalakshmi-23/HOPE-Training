class User{
    String name;
    String location;
    String phoneno;
    User(String name){
        this.name=name;
    }
    User(String name,String location,String phoneno){
        this.name=name;
        this.location=location;
        this.phoneno=phoneno;
        System.out.println("User created");
    }
    void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Location:"+location);
        System.out.println("Phoneno:"+phoneno);
    }
}
class RideUser extends User{
    String vehicletype,location;
    RideUser(String name,String location,String vehicletype){
        super(name);
        this.location=location;
        this.vehicletype=vehicletype;
    }
    void displayRide(){
        super.displayInfo();
        System.out.println("Location:"+location);
        System.out.println("Vehicletype:"+vehicletype);
    }
}
class Fooddelivery extends User{
    String favfood;
    Fooddelivery(String name,String favfood){
        super(name);
        this.favfood=favfood;
    }
    void displayf(){
        super.displayInfo();
        System.out.println("Your favourite food:"+favfood);
    }

}
class Parcel extends User{
    String parcelweight;
    Parcel(String name,String parcelweight){
        super(name);
        this.parcelweight=parcelweight;
    }
    void displayP(){
        super.displayInfo();
        System.out.println("Parcelweight:"+parcelweight);
    }

}
public class Task{
    public static void main(String[] args){
        User u=new User("Jack","chennai","97878475098");
        u.displayInfo();
        RideUser u1=new RideUser("One","Chennai","Car");
        u1.displayRide();
        Fooddelivery u2=new Fooddelivery("One","Biriyani");
        u2.displayf();
        Parcel u3=new Parcel("Two","100kg");
        u3.displayP();

    }
}
