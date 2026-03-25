
class Userdetails{
    String name;
    String address;
    int phoneno;
    Userdetails(){
        System.out.println("By using super");
    }
    Userdetails(String name){
        this.name=name;
        System.out.println("User created");
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Phoneno:"+phoneno);
    }
}
class Travel extends Userdetails{
    String location;
    Travel(String name,String location){
        super(name);
        this.location=location;
    }
    void displayt(){
        super.display();
        System.out.println("Location:"+location);
        System.out.println("Address:"+super.address);
    }
}
class Fooddelivery extends Userdetails{
    String item;
    Fooddelivery(String name,String item){
        this.item=item;
    }
    void displayf(){
        super.display();
        System.out.println("Item you ordered:"+item);
    }

}
public class App{
    public static void main(String[] args){
        Travel t=new Travel("Jane","Chrompet");
        t.displayt();
        Fooddelivery f=new Fooddelivery("Jane","Biriyani");
        f.displayf();

    }
}
