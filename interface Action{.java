interface Action{
    void execute();
}
class TurnONAction implements Action{
    Smartdevices device;
    TurnONAction(Smartdevices device){
        this.device=device;
    }
    public void create(){

    }
}
class Rule{
    Trigger trigger;
    Action action;
    Rule(Trigger trigger, Action action){
        this.trigger=trigger;
        this.action=action;
    }
    void result(){
        if(triggerisTriggered()){
            action.execute();
        }else{
            System.out.println("Trigger condition not met");
        }
    }
}