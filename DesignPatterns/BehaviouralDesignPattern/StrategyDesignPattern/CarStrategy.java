package DesignPatterns.BehaviouralDesignPattern.StrategyDesignPattern;

public class CarStrategy implements StrategyInterface{
    @Override
    public void plan(){
        System.out.println("Travel by car.");
    }
}
