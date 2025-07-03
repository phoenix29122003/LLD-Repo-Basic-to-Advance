package DesignPatterns.CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        GUIFactory factory = new MobileFactory();
        Application app=new Application(factory);
        app.render();
        factory=new PCFactory();
        app=new Application(factory);
        app.render();
    }
}
