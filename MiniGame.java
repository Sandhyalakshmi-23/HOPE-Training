class Name{
    String name;
    Name(String name){
        this.name=name;
        System.out.println("Name:"+name);
    }

}
class Warrior extends Name{
    Warrior(String name){
        super(name);
    }
    @override
    void attack(){
        System.out.println("Attack with sword");
    }
}
class Archer extends Name{
    Archer(String name){
        super(name);
    }
    @override
    void attack(){
        System.out.println("Attack with Arrow");
    }
}
class Rage extends Name{
    Rage(String name){
        super(name);
    }
    @override
    void attack(){
        System.out.println("Attack with Magic");
    }

}
public class MiniGame{
    public static void main(String[] args){
        MiniGame m=new Warrior("Black");
        m.attack();
    }
}