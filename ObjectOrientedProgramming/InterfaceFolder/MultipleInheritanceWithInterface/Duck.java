package ObjectOrientedProgramming.InterfaceFolder.MultipleInheritanceWithInterface;

public class Duck implements CanFly, CanSwim, CanWalk{
    @Override
    public void fly(){
        System.out.println("Duck flies.");
    }

    @Override
    public void swim(){
        System.out.println("Duck swims.");
    }

    @Override
    public void walk(){
        System.out.println("Duck walks.");
    }
}
