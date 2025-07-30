package DesignPatterns.BehaviouralDesignPattern.CommandDesignPattern;

public class FanOffCommand implements CommandInterface {
    private Fan fan;

    public FanOffCommand(Fan fan){
        this.fan=fan;
    }

    @Override
    public void execute(){
        fan.fanOff();
    }

    @Override
    public void undo(){
        fan.fanOn();
    }
}
