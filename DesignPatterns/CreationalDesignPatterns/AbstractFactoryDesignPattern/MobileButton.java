package DesignPatterns.CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class MobileButton implements Button{
    @Override
    public void render(){
        System.out.println("Mobile button is rendered.");
    }
}
