package ObjectOrientedProgramming.Composition.CompositionExample;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public Computer(CPU cpu, RAM ram, HardDrive hardDrive){
        this.cpu=cpu;
        this.ram=ram;
        this.hardDrive=hardDrive;
    }

    public void start(){
        System.out.println("Computer is starting.");
        cpu.process();
        ram.load();
        hardDrive.readData();
    }
}
