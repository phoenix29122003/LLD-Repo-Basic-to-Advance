package DesignPatterns.CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class PCFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new PCButton();
    }

    @Override
    public Menu createMenu(){
        return new PCMenu();
    }
}
