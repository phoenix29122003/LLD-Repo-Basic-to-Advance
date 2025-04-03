package ObjectOrientedProgramming.Inheritance.SuperKeywordInInheritance;

public class Person {
    public String name;
    public Integer age;

    Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
