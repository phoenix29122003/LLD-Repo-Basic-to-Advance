package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        VehicleFactory factory=new VehicleFactory();
        Vehicle car=factory.getVehicle("CAR");
        car.manufacture();
        Vehicle bike=factory.getVehicle("BIKE");
        bike.manufacture();
        Vehicle truck=factory.getVehicle("TRUCK");
        truck.manufacture();
    }
}
