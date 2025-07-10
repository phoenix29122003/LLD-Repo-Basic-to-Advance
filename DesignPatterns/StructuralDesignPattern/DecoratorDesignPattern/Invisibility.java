package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class Invisibility extends PlayerDecorator{
    public Invisibility(Player player){
        super(player);
    }

    public String intro(){
        return player.intro()+ " Invisibility";
    }
}
