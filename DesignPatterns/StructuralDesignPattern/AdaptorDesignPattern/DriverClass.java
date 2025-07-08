package DesignPatterns.StructuralDesignPattern.AdaptorDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        IndianSocket indianPlug=new IndianPlug();

        EuropianPlug euroPlug=new EuropianPlug();
        IndianSocket euroToIndAdapter=new EuroToIndianAdapter(euroPlug);

        SocketClass socket=new SocketClass(indianPlug);
        socket.plug();

        socket=new SocketClass(euroToIndAdapter);
        socket.plug();
    }
}
