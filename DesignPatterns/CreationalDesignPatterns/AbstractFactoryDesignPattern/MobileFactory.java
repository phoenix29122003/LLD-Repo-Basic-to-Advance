package DesignPatterns.CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class MobileFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MobileButton();
    }

    @Override
    public Menu createMenu(){
        return new MobileMenu();
    }
}
