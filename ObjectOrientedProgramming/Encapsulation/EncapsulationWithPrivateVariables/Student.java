package ObjectOrientedProgramming.Encapsulation.EncapsulationWithPrivateVariables;

public class Student {
    private String name;
    private Integer grade;

    public Student(String name,Integer grade){
        this.name=name;
        this.grade=grade;
    }

    public void updateGrade(Integer newGrade){
        this.grade=newGrade;
    }

    public Integer getGrade(){
        return grade;
    }
}
