package DesignPatterns.StructuralDesignPattern.CompositeDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        IC manu=new IC("Manu", "SDE");
        IC aditya=new IC("Aditya","QA");
        IC irfan=new IC("Irfan","SDE2");

        Manager itisha=new Manager("Itisha", "SDM");
        Manager shivam=new Manager("Shivam","SDM");

        itisha.addSubordinate(manu);
        itisha.addSubordinate(aditya);
        shivam.addSubordinate(irfan);

        Manager ajit=new Manager("Ajit", "SSDM");

        ajit.addSubordinate(itisha);
        ajit.addSubordinate(shivam);

        ajit.showDetails();
    }
}
