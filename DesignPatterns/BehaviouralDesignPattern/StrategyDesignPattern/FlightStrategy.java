package DesignPatterns.BehaviouralDesignPattern.StrategyDesignPattern;

public class FlightStrategy implements StrategyInterface{
    @Override
    public void plan(){
        System.out.println("Travel by flight.");
    }
}
