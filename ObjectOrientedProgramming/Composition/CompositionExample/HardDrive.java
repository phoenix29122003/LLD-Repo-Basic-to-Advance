package ObjectOrientedProgramming.Composition.CompositionExample;

public class HardDrive {
    private Integer capacity;

    public HardDrive(Integer capacity){
        this.capacity=capacity;
    }

    public void readData(){
        System.out.println("Hard Drive with " + capacity + " TB is reading data...");
    }
}
