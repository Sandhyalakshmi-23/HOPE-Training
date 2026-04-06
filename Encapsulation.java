class Bank{
    private double bal;
    public void setBalance(double bal){
        if(bal>0){
            this.balance=balance;
        }else{
            System.out.println("Input not valid");
        }
    }
    public void withdraw(int amt){
        if(amt>0 && amt<=bal){
            bal-=amt;
            System.out.println("Amount debited:"+amt);
        }else{
            System.out.println("Entered invalid amount");
        }
    }
    public double getBalance(){
        return bal;
    }
}
public class Encapsulation{
    p
}