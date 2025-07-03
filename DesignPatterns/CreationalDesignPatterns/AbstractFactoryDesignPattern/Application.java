package DesignPatterns.CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class Application {
    private final Button button;
    private final Menu menu;

    public Application(GUIFactory factory){
        button=factory.createButton();
        menu=factory.createMenu();
    }

    public void render(){
        button.render();
        menu.render();
    }
}
