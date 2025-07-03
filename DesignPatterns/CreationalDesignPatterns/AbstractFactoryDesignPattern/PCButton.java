package DesignPatterns.CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class PCButton implements Button{
    @Override
    public void render(){
        System.out.println("PC button is rendered.");
    }
}
