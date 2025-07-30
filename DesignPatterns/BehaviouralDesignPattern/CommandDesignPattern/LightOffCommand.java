package DesignPatterns.BehaviouralDesignPattern.CommandDesignPattern;

public class LightOffCommand implements CommandInterface {
    private Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.lightTurnOff();
    }

    @Override
    public void undo(){
        light.lightTurnOn();
    }
}
