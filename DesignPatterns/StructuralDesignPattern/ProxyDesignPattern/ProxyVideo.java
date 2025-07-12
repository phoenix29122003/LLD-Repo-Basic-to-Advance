package DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class ProxyVideo implements Video{
    private String videoName;
    private RealVideo realVideo;

    public ProxyVideo(String videoName){
        this.videoName=videoName;
    }

    @Override
    public void play(){
        if(realVideo==null){
            realVideo=new RealVideo(videoName);
        }
        realVideo.play();
    }
}
