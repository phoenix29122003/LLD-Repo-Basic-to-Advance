package ObjectOrientedProgramming.Composition.CompositionExample;

public class CPU {
    private String brand;
    private Integer speed;

    public CPU(String brand,Integer speed){
        this.brand=brand;
        this.speed=speed;
    }

    public void process(){
        System.out.println("CPU (" + brand + " - " + speed + " GHz) is processing data...");
    }
}
