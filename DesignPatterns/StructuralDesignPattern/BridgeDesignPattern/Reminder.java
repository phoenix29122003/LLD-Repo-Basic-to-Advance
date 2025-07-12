package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class Reminder extends Notification{
    private String msg;

    public Reminder(String msg,Channel channel){
        super(channel);
        this.msg=msg;
    }

    @Override 
    public void sendMsg(){
        channel.send(msg);
    }
}
