package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern;

public class Car implements Vehicle{
    @Override
    public void manufacture(){
        System.out.println("Car is manufactured");
    }
}
