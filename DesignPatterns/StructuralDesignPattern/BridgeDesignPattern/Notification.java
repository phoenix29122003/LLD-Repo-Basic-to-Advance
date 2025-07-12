package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public abstract class Notification {
    protected Channel channel;

    public Notification(Channel channel){
        this.channel=channel;
    }

    public abstract void sendMsg();
}
