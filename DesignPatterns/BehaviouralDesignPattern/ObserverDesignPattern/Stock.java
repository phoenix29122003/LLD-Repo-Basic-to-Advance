package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockPriceTracker{
    private List<Subscriber>investors;
    private Integer stockPrice;

    public Stock(Integer stockPrice){
        this.investors=new ArrayList<>();
        this.stockPrice=stockPrice;
    }

    @Override
    public void registerInvestor(Subscriber investor){
        investors.add(investor);
    }

    @Override
    public void removeInvestor(Subscriber investor){
        investors.remove(investor);
    }

    public void setStockPrice(Integer newStockPrice){
        this.stockPrice=newStockPrice;
        System.out.println("Stock price updated. New stock price: "+stockPrice);

        notifyInvestor();
    }

    @Override
    public void notifyInvestor(){
        for(Subscriber investor:investors){
            investor.update(stockPrice);
        }
    }
}
