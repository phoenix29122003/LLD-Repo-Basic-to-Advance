package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern;

public class Investor implements Subscriber{
    private String name;

    public Investor(String name){
        this.name=name;
    }

    @Override
    public void update(Integer stockPrice){
        System.out.println(name+", stock price is updated. New price: "+stockPrice);
    }
}
