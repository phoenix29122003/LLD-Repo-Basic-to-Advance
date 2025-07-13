package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        Stock appleStock=new Stock(100);

        Subscriber appleStockInvestor1=new Investor("Manu");
        Subscriber appleStockInvestor2=new Investor("Tanu");

        appleStock.registerInvestor(appleStockInvestor1);
        appleStock.registerInvestor(appleStockInvestor2);

        appleStock.setStockPrice(120);

        appleStock.removeInvestor(appleStockInvestor2);

        appleStock.setStockPrice(140);
    }
}
