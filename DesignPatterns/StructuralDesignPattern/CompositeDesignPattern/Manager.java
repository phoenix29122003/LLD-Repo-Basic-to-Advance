package DesignPatterns.StructuralDesignPattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private String position;
    private List<Employee> subordinates;

    public Manager(String name,String position){
        this.name=name;
        this.position=position;
        this.subordinates=new ArrayList<>();
    }

    public void addSubordinate(Employee employee){
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee){
        subordinates.remove(employee);
    }

    @Override
    public void showDetails(){
        System.out.println("name: "+name);
        System.out.println("position: "+position);
        for(Employee emp:subordinates){
            emp.showDetails();
        }
        System.out.println("");
    }
}
