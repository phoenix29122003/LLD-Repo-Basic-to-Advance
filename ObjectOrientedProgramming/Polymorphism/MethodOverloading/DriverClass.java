package ObjectOrientedProgramming.Polymorphism.MethodOverloading;

public class DriverClass {
    public static void main(String args[]){
        MathOperation mathBook=new MathOperation();

        System.out.println(mathBook.add(2, 5));
        System.out.println(mathBook.add(3,5,7));
        System.out.println(mathBook.add(2.4,5.5));
    }
}
