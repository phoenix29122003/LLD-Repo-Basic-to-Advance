package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class Sheild extends PlayerDecorator{
    public Sheild(Player player){
        super(player);
    }

    @Override
    public String intro(){
        return player.intro()+" Sheild";
    }
}
