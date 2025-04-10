package ObjectOrientedProgramming.Association;

public class DriverClass {
    public static void main(String args[]){
        Course course1=new Course("DSA");
        Course course2=new Course("DBMS");
        Course course3=new Course("OS");
        Course course4=new Course("CN");

        Student student1=new Student("Manu");
        Student student2=new Student("Monty");
        Student student3=new Student("Bajrangi");
        Student student4=new Student("Shriram");

        student1.addCourse(course1);
        student1.addCourse(course2);

        course3.addStudent(student3);
        course3.addStudent(student4);

        student1.showStudentInfo();
        course3.showCourseInfo();
    }
}
