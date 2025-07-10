package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        Player basicPlayer = new BasicPlayer();
        Player shieldPlayer = new Sheild(basicPlayer);
        System.out.println(shieldPlayer.intro());

        Player shieldSpeedPlayer = new SpeedBooster(shieldPlayer);
        System.out.println(shieldSpeedPlayer.intro());

        Player shieldSpeedInvisiblePlayer = new Invisibility(shieldSpeedPlayer);
        System.out.println(shieldSpeedInvisiblePlayer.intro());
    }
}
