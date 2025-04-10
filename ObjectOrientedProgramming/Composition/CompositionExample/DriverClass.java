package ObjectOrientedProgramming.Composition.CompositionExample;

public class DriverClass {
    public static void main(String args[]){
        CPU cpu=new CPU("intel", 15);
        RAM ram=new RAM(16);
        HardDrive hardDrive=new HardDrive(1);

        Computer myComputer=new Computer(cpu, ram, hardDrive);

        myComputer.start();
    }
}
