package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class Alert extends Notification{
    private String msg;

    public Alert(String msg,Channel channel){
        super(channel);
        this.msg=msg;
    }

    @Override
    public void sendMsg(){
        channel.send(msg);
    }
}
