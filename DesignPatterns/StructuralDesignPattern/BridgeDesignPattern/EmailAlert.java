package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class EmailAlert implements Channel{
    @Override
    public void send(String msg){
        System.out.println("Email: "+msg);
    }
}
