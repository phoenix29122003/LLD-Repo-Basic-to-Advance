package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class PushAlert implements Channel{
    @Override
    public void send(String msg){
        System.out.println("Push: "+msg);
    }
}
