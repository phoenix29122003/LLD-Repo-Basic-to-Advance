package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern;

public interface StockPriceTracker {
    void registerInvestor(Subscriber investor);
    void removeInvestor(Subscriber investor);
    void notifyInvestor();
}
