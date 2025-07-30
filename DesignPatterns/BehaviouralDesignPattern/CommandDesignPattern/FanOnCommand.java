package DesignPatterns.BehaviouralDesignPattern.CommandDesignPattern;

public class FanOnCommand implements CommandInterface {
    private Fan fan;

    public FanOnCommand(Fan fan){
        this.fan=fan;
    }

    @Override
    public void execute(){
        fan.fanOn();
    }

    @Override
    public void undo(){
        fan.fanOff();
    }
}
