package ObjectOrientedProgramming.Inheritance.SuperKeywordInInheritance;

public class Student extends Person{
    public double grade;

    Student(String name, Integer age, double grade){
        super(name,age);
        this.grade=grade;
    }

    public void displayStudentInfo(){
        super.displayInfo();
        System.out.println("Grade: "+grade);
    }
}
