package ObjectOrientedProgramming.Encapsulation.EncapsulationAndDataHiding;

public class Student{
    private String name;
    private Integer rollNumber;
    private Integer marks;

    public Student(String name,Integer rolllNumber, Integer marks){
        this.name=name;
        this.rollNumber=rolllNumber;
        this.marks=marks;
    }

    public String getName(){
        return name;
    }

    public Integer getRollNumber(){
        return rollNumber;
    }

    public Integer getMarks(){
        return marks;
    }

    public void setMarks(Integer newMarks){
        this.marks=newMarks;
    }

    public void printGrade(){
        if(marks>=90) System.out.println("Excellent");
        else System.out.print("Good");
    }
}