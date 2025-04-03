package ObjectOrientedProgramming.Inheritance.MethodOverriding;

public class DriverClass {
    public static void main(String args[]){
        Vehicle myVehicle=new Vehicle();
        Car myCar=new Car();

        myVehicle.move();
        myCar.move();
    }
}
