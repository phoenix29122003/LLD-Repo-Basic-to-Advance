package DesignPatterns.BehaviouralDesignPattern.CommandDesignPattern;

public class RemoteControl {
    private CommandInterface command;

    public RemoteControl(CommandInterface command){
        this.command=command;
    }

    public void set(CommandInterface cmd){
        command=cmd;
    }

    public void pressBtn(){
        command.execute();
    }

    public void pressUndoBtn(){
        command.undo();
    }
}
