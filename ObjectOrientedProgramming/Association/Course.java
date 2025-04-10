package ObjectOrientedProgramming.Association;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student>students;

    public Course(String name){
        this.courseName=name;
        this.students=new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getCourseName(){
        return courseName;
    }

    public void showCourseInfo(){
        System.out.println(courseName+" is studied by below students: ");
        for(Student student:students){
            System.out.println(student.getName());
        }
    }
}
