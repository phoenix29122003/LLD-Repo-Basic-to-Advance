package ObjectOrientedProgramming.Polymorphism.InterfacePolymorphism;

public class DriverClass {
    public static void main(String args[]){
        Parrot myParrot=new Parrot();
        Eagle myEagle=new Eagle();

        myEagle.fly();
        myEagle.makeSound();

        myParrot.fly();
        myParrot.makeSound();
    }
}
