package ObjectOrientedProgramming.Aggregation.AggregationUsingInterface;

public class Painter implements Creatable{
    private String name;
    private String style;

    public Painter(String name,String style){
        this.name=name;
        this.style=style;
    }

    public void createArt(){
        System.out.println(name+" creates a "+ style +" painting.");
    }
}
