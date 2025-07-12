package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class SMSAlert implements Channel{
    @Override
    public void send(String msg){
        System.out.println("SMS: "+msg);
    }
}
