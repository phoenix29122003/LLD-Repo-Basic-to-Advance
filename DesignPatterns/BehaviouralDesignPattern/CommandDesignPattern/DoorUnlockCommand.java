package DesignPatterns.BehaviouralDesignPattern.CommandDesignPattern;

public class DoorUnlockCommand implements CommandInterface {
    private Door door;

    public DoorUnlockCommand(Door door){
        this.door=door;
    }

    @Override
    public void execute(){
        door.doorOpen();
    }

    @Override
    public void undo(){
        door.doorClose();
    }
}
