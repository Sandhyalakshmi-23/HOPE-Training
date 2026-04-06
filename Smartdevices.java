interface Action{
    void execute();
}
class TurnONAction implements Action{
    Smartdevices device;
    
}
class Rule{
    Trigger trigger;
    Action action;
    Rule(Trigger trigger, Action action){
        this.trigger=trigger;
        this.action=action;
    }
    void result(){
        if(Trigger.isTriggered()){

        }else{
            System.out.println("NO action");
        }
    }
}
public class Action{
    public static void main(String[] args){
        Trigger t1,t2,t3;
        Action a1,a2,a3;
        Rule r1=new Rule(triggeredmotion,turnonight);
        Rule r2=new Rule(temp,turnoffAc);
        Rule r3=new Rule(time,turnonlight);
    }
}