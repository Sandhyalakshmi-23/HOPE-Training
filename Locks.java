class Locker{
    int lockid;
    boolean islocked=true;
    int pincode;
    public void retrieveItem(int pin){
        if(pin==pincode){
            if(!islocked && storeditem!=null){
                System.out.println("Retrieved item"+storeditem);
                storeditem=null;
            }else if(storeditem==null){
                System.out.println("Locker is empty");
            }else{
                System.out.println("Invalid method");
            }
        }else{
            System.out.println("Pin is wrong");
        }
    }
    public void unlock(int pin){
        if(pin==pincode){
            islocked=false;
            System.out.println("Locked unlocked");
        }
        else{
            System.out.println("Wrong pin");
        }
    }
    public void lock(){
        islocked=true;
        System.out.println("Locker locked");
    }
}
public class Locks{
    public static void main(String[] args){
        
    }
}