package DesignPatterns.BehaviouralDesignPattern.CommandDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        Light light = new Light();
        Fan fan = new Fan();
        Door door = new Door();

        LightOnCommand lightOnCommand=new LightOnCommand(light);
        LightOffCommand lightOffCommand=new LightOffCommand(light);

        FanOnCommand fanOnCommand=new FanOnCommand(fan);
        FanOffCommand fanOffCommand=new FanOffCommand(fan);

        DoorLockCommand doorLockCommand=new DoorLockCommand(door);
        DoorUnlockCommand doorUnlockCommand=new DoorUnlockCommand(door);

        RemoteControl remoteControl=new RemoteControl(fanOnCommand);
        remoteControl.pressBtn();
        remoteControl.pressUndoBtn();

        remoteControl.set(fanOffCommand);
        remoteControl.pressBtn();
        remoteControl.pressUndoBtn();

        remoteControl.set(doorLockCommand);
        remoteControl.pressBtn();
        remoteControl.pressUndoBtn();

        remoteControl.set(doorUnlockCommand);
        remoteControl.pressBtn();
        remoteControl.pressUndoBtn();

        remoteControl.set(lightOnCommand);
        remoteControl.pressBtn();
        remoteControl.pressUndoBtn();

        remoteControl.set(lightOffCommand);
        remoteControl.pressBtn();
        remoteControl.pressUndoBtn();
    }
}
