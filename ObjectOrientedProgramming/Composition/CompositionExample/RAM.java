package ObjectOrientedProgramming.Composition.CompositionExample;

public class RAM {
    private Integer size;

    public RAM(Integer size){
        this.size=size;
    }

    public void load(){
        System.out.println("RAM of " + size + " GB is loading programs into memory...");
    }
}
