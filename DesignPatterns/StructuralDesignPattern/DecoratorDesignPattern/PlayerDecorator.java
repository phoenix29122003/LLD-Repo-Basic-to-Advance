package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public abstract class PlayerDecorator implements Player{
    public Player player;

    public PlayerDecorator(Player player){
        this.player=player;
    }

    @Override
    public String intro(){
        return player.intro();
    }
}
