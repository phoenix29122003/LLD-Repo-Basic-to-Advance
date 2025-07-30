package DesignPatterns.BehaviouralDesignPattern.CommandDesignPattern;

public class LightOnCommand implements CommandInterface{
    private Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.lightTurnOn();
    }

    @Override
    public void undo(){
        light.lightTurnOff();
    }
}
