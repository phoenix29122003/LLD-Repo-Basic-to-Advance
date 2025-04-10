package ObjectOrientedProgramming.Aggregation.AggregationUsingInterface;

import java.util.ArrayList;

public class ArtGallary {
    private String galleryName;
    private ArrayList<Creatable>artists;

    public ArtGallary(String galleryName){
        this.galleryName=galleryName;
        this.artists=new ArrayList<>();
    }
    public void addArtist(Creatable artist){
        artists.add(artist);
    }

    public void showcaseArt(){
        System.out.println(galleryName +" has below artists: ");
        for(Creatable artist:artists){
            artist.createArt();
        }
    }
}
