package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class SpeedBooster extends PlayerDecorator{
    public SpeedBooster(Player player){
        super(player);
    }

    @Override 
    public String intro(){
        return player.intro()+ " Speed";
    }
}
