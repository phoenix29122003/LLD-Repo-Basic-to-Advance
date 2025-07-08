package DesignPatterns.StructuralDesignPattern.AdaptorDesignPattern;

public class SocketClass {
    IndianSocket indianSocket;

    public SocketClass(IndianSocket indianSocket){
        this.indianSocket=indianSocket;
    }

    public void plug(){
        indianSocket.plugin();
    }
}
