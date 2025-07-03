package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern;

public class Truck implements Vehicle{
    @Override
    public void manufacture(){
        System.out.println("Truck is manufactured.");
    }
}
