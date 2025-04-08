package ObjectOrientedProgramming.Encapsulation.EncapsulationWithPrivateVariables;

public class DriverClass {
    public static void main(String[] args) {
    Student manu=new Student("Manu", 86);

    System.out.println("Current Grade: "+manu.getGrade());
    manu.updateGrade(90);
    System.out.println("Updated Grade: "+manu.getGrade());
}
}
