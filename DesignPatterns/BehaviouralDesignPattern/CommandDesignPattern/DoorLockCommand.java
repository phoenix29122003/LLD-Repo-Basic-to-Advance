package DesignPatterns.BehaviouralDesignPattern.CommandDesignPattern;

public class DoorLockCommand implements CommandInterface {
    private Door door;

    public DoorLockCommand(Door door){
        this.door=door;
    }

    @Override
    public void execute(){
        door.doorClose();
    }

    @Override
    public void undo(){
        door.doorOpen();
    }
}
