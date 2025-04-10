package ObjectOrientedProgramming.Aggregation.AggregationUsingInterface;

public class Sculptor implements Creatable{
    private String name;
    private String material;

    public Sculptor(String name,String material){
        this.name=name;
        this.material=material;
    }

    public void createArt(){
        System.out.println(name + " sculpts using "+material);
    }
}
