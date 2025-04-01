package ObjectOrientedProgramming.InterfaceFolder.ImplementingAnInterface;

public class Fan implements Appliance{
    @Override
    public void turnOn(){
        System.out.println("Fan is starting.");
    }

    @Override
    public void turnOff(){
        System.out.println("Fan is stopping.");
    }
}
