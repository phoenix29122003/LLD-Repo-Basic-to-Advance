package DesignPatterns.CreationalDesignPatterns.SingletonDesignPattern.SimpleSingelonDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        SingletonClass obj1=SingletonClass.getInstance();
        SingletonClass obj2=SingletonClass.getInstance();

        System.out.println("Hashcode of obj1: " + obj1.hashCode());
        System.out.println("Hashcode of obj2: " + obj2.hashCode());

        if(obj1==obj2){
            System.out.println("Both objects are same.");
        }
        else{
            System.out.println("Some blunder is there.");
        }
    }
}
