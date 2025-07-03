package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern;

public class Bike implements Vehicle{
    @Override
    public void manufacture(){
        System.out.println("Bike is manufactured.");
    }
}
