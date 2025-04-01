package ObjectOrientedProgramming.InterfaceFolder.DefaultMethodInInterface;

public interface Bird {
    void makeSound();

    default void fly(){
        System.out.println("Bird flies.");
    }
}
