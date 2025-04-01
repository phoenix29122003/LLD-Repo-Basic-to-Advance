package ObjectOrientedProgramming.InterfaceFolder.ImplementingAnInterface;

public class DriverClass {
    public static void main(String args[]){
        Appliance myFan=new Fan();
        myFan.turnOn();
        myFan.turnOff();
    }
}
