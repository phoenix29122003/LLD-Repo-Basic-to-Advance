package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern;

public class VehicleFactory {
    Vehicle getVehicle(String type){
        if(type=="CAR"){
            return new Car();
        }
        else if(type=="BIKE"){
            return new Bike();
        }
        else if(type=="TRUCK"){
            return new Truck();
        }
        return null;
    }
}
