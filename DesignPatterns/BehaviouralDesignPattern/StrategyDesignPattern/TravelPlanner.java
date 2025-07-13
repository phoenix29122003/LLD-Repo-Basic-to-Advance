package DesignPatterns.BehaviouralDesignPattern.StrategyDesignPattern;

public class TravelPlanner {
    StrategyInterface strategy;

    public void setStrategy(StrategyInterface strategy){
        this.strategy=strategy;
    }

    public void plan(){
        if(strategy==null){
            System.out.println("No strategy selected");
        }
        else {
            strategy.plan();
        }
    }
}
