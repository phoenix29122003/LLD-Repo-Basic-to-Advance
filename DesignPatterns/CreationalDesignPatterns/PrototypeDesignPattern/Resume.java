package DesignPatterns.CreationalDesignPatterns.PrototypeDesignPattern;

public class Resume implements Document{
    private String name;
    private String education;
    private String skill;

    public Resume(String name,String education,String skill){
        this.name=name;
        this.education=education;
        this.skill=skill;
    }

    @Override
    public Document clone(){
        return new Resume(name,education,skill);
    }

    @Override
    public void print(){
        System.out.println("name: "+ name);
        System.out.println("education: "+ education);
        System.out.println("skill: "+ skill);
    }
}
