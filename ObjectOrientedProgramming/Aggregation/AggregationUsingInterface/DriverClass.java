package ObjectOrientedProgramming.Aggregation.AggregationUsingInterface;

public class DriverClass {
    public static void main(String args[]){
        Creatable painterManu=new Painter("Manu", "Ghibli art");
        Creatable scultorManu=new Sculptor("Manu", "Gold");

        ArtGallary gallary=new ArtGallary("Manu gallery");

        gallary.addArtist(painterManu);
        gallary.addArtist(scultorManu);

        gallary.showcaseArt();
    }
}
