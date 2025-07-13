package DesignPatterns.BehaviouralDesignPattern.StrategyDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        TravelPlanner planner=new TravelPlanner();

        TrainStrategy train=new TrainStrategy();
        FlightStrategy flight=new FlightStrategy();
        CarStrategy car=new CarStrategy();

        planner.setStrategy(car);
        planner.plan();

        planner.setStrategy(train);
        planner.plan();

        planner.setStrategy(flight);
        planner.plan();
    }
}
