package ObjectOrientedProgramming.Inheritance.HierarchicalInheritance;

public class DriverClass {
    public static void main(String args[]){
        Developer myDeveloper=new Developer();
        Manager myManager=new Manager();

        myDeveloper.work();
        myDeveloper.code();

        myManager.work();
        myManager.manage();
    }
}
