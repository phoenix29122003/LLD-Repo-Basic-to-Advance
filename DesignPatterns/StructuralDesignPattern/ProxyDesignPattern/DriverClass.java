package DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        Video video=new ProxyVideo("Video1");

        video.play();

        video.play();
    }
}
