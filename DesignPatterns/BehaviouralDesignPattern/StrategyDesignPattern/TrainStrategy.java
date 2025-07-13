package DesignPatterns.BehaviouralDesignPattern.StrategyDesignPattern;

public class TrainStrategy implements StrategyInterface{
    @Override
    public void plan(){
        System.out.println("Travel by train.");
    }
}
