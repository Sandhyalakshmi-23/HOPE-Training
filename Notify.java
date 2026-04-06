<<<<<<< HEAD
class Notification{
    String name, msg;
    Notification(String name, String msg){
        this.name=name;
        this.msg=msg;
    }
    void send(){
        System.out.println("Sending Notification");
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name, String msg){
        super(name,msg);
    }
    void send(){
        System.out.println("Sending Email Notification to"+name);
        System.out.println("Message:"+msg);
    }
}
class SmsNotification extends Notification{
    SmsNotification(String name, String msg){
        super(name,msg);
    }
    void send(){
    System.out.println("Sending SMS Notificaion");
    }
}
public class Notify{
    public static void main(String[] args){
        Notification n;
        n=new EmailNotification("test","Order placed");
        n.send();
        n=new SmsNotification("test1","Recharge successful");
        n.send();
    }
=======
class Notification{
    String name, msg;
    Notification(String name, String msg){
        this.name=name;
        this.msg=msg;
    }
    void send(){
        System.out.println("Sending Notification");
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name, String msg){
        super(name,msg);
    }
    void send(){
        System.out.println("Sending Email Notification to"+name);
        System.out.println("Message:"+msg);
    }
}
class SmsNotification extends Notification{
    SmsNotification(String name, String msg){
        super(name,msg);
    }
    void send(){
    System.out.println("Sending SMS Notificaion");
    }
}
public class Notify{
    public static void main(String[] args){
        Notification n;
        n=new EmailNotification("test","Order placed");
        n.send();
        n=new SmsNotification("test1","Recharge successful");
        n.send();
    }
>>>>>>> a6a9cce24ff92adce4fe1431f66e8951287cb92a
}