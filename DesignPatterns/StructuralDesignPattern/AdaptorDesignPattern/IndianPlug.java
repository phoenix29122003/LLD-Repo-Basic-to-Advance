package DesignPatterns.StructuralDesignPattern.AdaptorDesignPattern;

public class IndianPlug implements IndianSocket{
    @Override
    public void plugin(){
        System.out.println("Plugged in Indian Socket.");
    }
}
