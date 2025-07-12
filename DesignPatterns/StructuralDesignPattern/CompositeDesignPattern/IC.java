package DesignPatterns.StructuralDesignPattern.CompositeDesignPattern;

public class IC implements Employee{
    private String name;
    private String position;

    public IC(String name,String position){
        this.name=name;
        this.position=position;
    }

    @Override
    public void showDetails(){
        System.out.println("name: "+name);
        System.out.println("position: "+position);
    }
}
