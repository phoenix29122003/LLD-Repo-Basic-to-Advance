package DesignPatterns.StructuralDesignPattern.AdaptorDesignPattern;

public class EuroToIndianAdapter implements IndianSocket{
    public EuropianPlug euroPlug;

    public EuroToIndianAdapter(EuropianPlug euroPlug){
        this.euroPlug=euroPlug;
    }

    @Override
    public void plugin(){
        euroPlug.connectToEuroSocket();
    }
}
