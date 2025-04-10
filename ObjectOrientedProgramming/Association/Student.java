package ObjectOrientedProgramming.Association;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course>courses;

    public Student(String name){
        this.name=name;
        this.courses=new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String getName(){
        return name;
    }

    public void showStudentInfo(){
        System.out.println(name+ " studies below courses: ");
        for(Course course:courses){
            System.out.println(course.getCourseName());
        }
    }
}
