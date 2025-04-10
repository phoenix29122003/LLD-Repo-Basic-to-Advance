package ObjectOrientedProgramming.Encapsulation.EncapsulationAndDataHiding;

public class DriverClass {
    public static void main(String args[]){
        Student manu=new Student("Manu", 21, 91);

        System.out.println("Name: "+manu.getName());
        System.out.println("Roll Number: "+manu.getRollNumber());
        System.out.println("Marks: "+manu.getMarks());
        manu.printGrade();

        manu.setMarks(86);
        System.out.println("Marks: "+manu.getMarks());
        manu.printGrade();
    }
}
