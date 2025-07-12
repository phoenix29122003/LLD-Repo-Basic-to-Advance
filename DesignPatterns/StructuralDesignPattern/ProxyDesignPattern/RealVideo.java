package DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class RealVideo implements Video{
    private String videoName;

    public RealVideo(String videoName){
        this.videoName=videoName;

        fetchVideoFromDisk();
    }

    private void fetchVideoFromDisk(){
        System.out.println(videoName+" is fetched from disk");
    }

    @Override
    public void play(){
        System.out.println(videoName+" is being played.");
    }
}
