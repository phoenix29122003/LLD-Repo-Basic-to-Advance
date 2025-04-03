package ObjectOrientedProgramming.Polymorphism.InterfacePolymorphism;

public class Eagle implements Bird{
    @Override
    public void makeSound(){
        System.out.println("Eagle is screeching.");
    }
}
